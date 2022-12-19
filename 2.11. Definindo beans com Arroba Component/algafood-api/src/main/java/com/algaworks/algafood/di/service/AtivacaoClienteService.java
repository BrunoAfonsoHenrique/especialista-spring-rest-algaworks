package com.algaworks.algafood.di.service;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {
	
	private NotificadorEmail notificador;
	
	public AtivacaoClienteService(NotificadorEmail notificador) {
		this.notificador = notificador;
	}
	
	public void Ativar(Cliente cliente) {
		cliente.ativar();	
		//NotificadorSms notificador = new NotificadorSms();
		notificador.notificar(cliente, "Seu cadastro no sistema esta ativo");
	}

}
