package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.nitificacao.Notificador;
import com.algaworks.di.nitificacao.NotificadorEmail;
import com.algaworks.di.nitificacao.NotificadorSms;
import com.algaworks.di.service.AtivacaoClienteService;

public class Main {
	
	public static void main(String[] args) {		
		
		Cliente maria = new Cliente("Maria", "Maria@xyz.com", "66667777");
		
		Notificador notificador = new NotificadorSms();
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.Ativar(maria);
		
		Cliente joao = new Cliente("Joao", "joao@xyz.com", "44445555");
		Notificador notificador2 = new NotificadorEmail();
		AtivacaoClienteService ativacaoCliente2 = new AtivacaoClienteService(notificador2);
		ativacaoCliente2.Ativar(joao);
	}
}
