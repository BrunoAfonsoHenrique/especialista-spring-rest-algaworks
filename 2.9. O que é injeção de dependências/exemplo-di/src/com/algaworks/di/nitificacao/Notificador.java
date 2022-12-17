package com.algaworks.di.nitificacao;

import com.algaworks.di.modelo.Cliente;

public interface Notificador {
	
	void notificar(Cliente cliente, String mensagem);
}
