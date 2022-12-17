package com.algaworks.principal;

import com.algaworks.di.capturar.Capturar;
import com.algaworks.di.capturar.CapturarCharmander;
import com.algaworks.di.capturar.CapturarPicachu;
import com.algaworks.di.modelo.Treinador;
import com.algaworks.di.service.CacadaPokemon;

public class Main {

	public static void main(String[] args) {
		
		Treinador treinadorAriel = new Treinador("Ariel", "300");	
		Capturar capturarCharmander = new CapturarCharmander();
		CacadaPokemon pegarCharmander = new CacadaPokemon(capturarCharmander);
		pegarCharmander.pegarPokemon(treinadorAriel);
		
		
		Treinador treinadorBruno = new Treinador("Bruno", "27");
		Capturar capturarPicachu = new CapturarPicachu();
		CacadaPokemon pegarPicachu = new CacadaPokemon(capturarPicachu);
		pegarPicachu.pegarPokemon(treinadorBruno);

	}

}
