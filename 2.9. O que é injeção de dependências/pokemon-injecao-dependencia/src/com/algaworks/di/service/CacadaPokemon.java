package com.algaworks.di.service;

import com.algaworks.di.capturar.Capturar;
import com.algaworks.di.modelo.Treinador;

public class CacadaPokemon {
	
	private Capturar capturar;
	
	
	
	public CacadaPokemon(Capturar capturar) {
		this.capturar = capturar;
	}



	public void pegarPokemon(Treinador treinador) {
		capturar.capturar(treinador, "com sucesso!");
	}

}
