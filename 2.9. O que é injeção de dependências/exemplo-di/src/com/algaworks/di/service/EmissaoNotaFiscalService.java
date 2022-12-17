package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.Produto;
import com.algaworks.di.nitificacao.Notificador;

public class EmissaoNotaFiscalService {
	
	private Notificador notificador;
	
	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void emitirNotaFiscal(Cliente cliente, Produto produto) {
		// TODO emite nota fiscal aqui...
		
		notificador.notificar(cliente, "Nota fiscal do produto" + produto.getNome() 
			+ " foi emitida!");
	}

}
