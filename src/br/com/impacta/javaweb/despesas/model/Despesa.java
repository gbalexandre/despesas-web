package br.com.impacta.javaweb.despesas.model;

import java.time.LocalDateTime;

public class Despesa {
	
	private String descricao;
	private CategoriaDespesa categoria;
	private LocalDateTime data;
	private double valor;
	private String observacao;
	
	public Despesa( ) {}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public CategoriaDespesa getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaDespesa categoria) {
		this.categoria = categoria;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Despesa(String descricao, CategoriaDespesa categoria, LocalDateTime data, double valor, String observacao) {
		super();
		this.descricao = descricao;
		this.categoria = categoria;
		this.data = data;
		this.valor = valor;
		this.observacao = observacao;
	}
	
	
	
	

}
