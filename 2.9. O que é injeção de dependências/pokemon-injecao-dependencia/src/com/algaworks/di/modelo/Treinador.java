package com.algaworks.di.modelo;

public class Treinador {
	
	private String nome;
	private String idade;
	
	
	
	public Treinador(String nome, String idade) {
		this.nome = nome;
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}

	public String getIdade() {
		return idade;
	}
	

}
