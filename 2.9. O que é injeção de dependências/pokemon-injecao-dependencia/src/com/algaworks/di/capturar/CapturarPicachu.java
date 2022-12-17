package com.algaworks.di.capturar;

import com.algaworks.di.modelo.Treinador;

public class CapturarPicachu implements Capturar {

	@Override
	public void capturar(Treinador treinador, String mensagem) {
		System.out.printf("O treinador(a) %s, com idade de %s anos, capturou o pokemon picachu %s\n", 
				treinador.getNome(), treinador.getIdade(), mensagem);
	}
	
}
