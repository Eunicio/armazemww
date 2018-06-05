package com.armazemww.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Fardo implements Serializable {

	@Id
	private String codigo_Barras;
	private String tipo_peca;
	private String preco_unitario;
	private String quantidade;
	
	@ManyToOne
	private Fornecedor fornecedor;
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getCodigo_Barras() {
		return codigo_Barras;
	}
	public void setCodigo_Barras(String codigo_Barras) {
		this.codigo_Barras = codigo_Barras;
	}
	public String getTipo_peca() {
		return tipo_peca;
	}
	public void setTipo_peca(String tipo_peca) {
		this.tipo_peca = tipo_peca;
	}
	public String getPreco_unitario() {
		return preco_unitario;
	}
	public void setPreco_unitario(String preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
}
