package com.devsoft.desafio2.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_atividade")
public class Atividade {
	
	@Id //Define o Id como primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Gera o AUTO INCREMENT
	private Integer id;
	private String nome;
	
	@Column(columnDefinition = "TEXT") //Definindo o tipo de campo do DB como "TEXT". Aceita acima de 255 caracters
	private String descricao;
	private Double preco;
	
	
	
	
	
	public Atividade() {
	}

	public Atividade(Integer id, String nome, String descricao, Double preco) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}	
	
	
	
}
