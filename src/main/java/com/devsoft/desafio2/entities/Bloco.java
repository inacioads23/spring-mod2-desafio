package com.devsoft.desafio2.entities;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_bloco")
public class Bloco {
	
	@Id //Define o Id como primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Gera o AUTO INCREMENT
	private Integer id;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE") //define o tipo correto para o DB
	private Instant inicio;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE") //define o tipo correto para o DB
	private Instant fim;

	
	public Bloco() {
	}

	public Bloco(Integer id, Instant inicio, Instant fim) {
		this.id = id;
		this.inicio = inicio;
		this.fim = fim;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Instant getInicio() {
		return inicio;
	}

	public void setInicio(Instant inicio) {
		this.inicio = inicio;
	}

	public Instant getFim() {
		return fim;
	}

	public void setFim(Instant fim) {
		this.fim = fim;
	}
	
	
	
	
}
