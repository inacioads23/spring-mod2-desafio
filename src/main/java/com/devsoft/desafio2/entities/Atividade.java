package com.devsoft.desafio2.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_atividade")
public class Atividade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	@Column(columnDefinition = "TEXT")
	private String descricao;
	private Double preco;
	
	//de Atividade para Categoria: Muitos-para-um. Nome do relacionamento: categoria
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;
	
	//de Atividade para Participante: muitos-para-muitos
	@ManyToMany
	@JoinTable(name = "tb_atividade_participante",
			joinColumns = @JoinColumn(name = "atividade_id"),
			inverseJoinColumns = @JoinColumn(name = "participante_id"))
	private Set<Atividade> participantes = new HashSet<>(); //"Set" para informar ao JPA que não pode haver repetição na listagem

	
	
	//de Atividade para Bloco: um-para-um. Nome do relacionamento: blocos	
	@OneToOne(mappedBy = "atividade", cascade = CascadeType.ALL)
	private Bloco blocos;
	
	
	//de Atividade para Bloco: um-para-muitos. Nome do relacionamento: blocos	
	@OneToMany(mappedBy = "atividade")
	private List<Bloco> bloco = new ArrayList<>();
	

	
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
