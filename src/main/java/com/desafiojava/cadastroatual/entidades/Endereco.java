package com.desafiojava.cadastroatual.entidades;

import javax.persistence.Embeddable;


@Embeddable
public class Endereco {

	private String logradouro;
	private String cep;
	private int numero;
	private String cidade;
	
	public Endereco() {
		}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	
}
