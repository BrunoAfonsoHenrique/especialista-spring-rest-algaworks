package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.nitificacao.Notificador;
import com.algaworks.di.nitificacao.NotificadorSms;

public class AtivacaoClienteService {
	
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void Ativar(Cliente cliente) {
		cliente.ativar();	
		//NotificadorSms notificador = new NotificadorSms();
		notificador.notificar(cliente, "Seu cadastro no sistema esta ativo");
	}

}
