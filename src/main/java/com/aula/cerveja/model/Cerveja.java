package com.aula.cerveja.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cerveja {
	@NotBlank
	private String sku;

	@NotBlank
	private String nome;

	@Size(min = 4, max = 50, message = "ERRO")
	private String descricao;

	public Cerveja() {
		// TODO Auto-generated constructor stub
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
