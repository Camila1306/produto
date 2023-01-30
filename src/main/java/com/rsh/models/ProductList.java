package com.rsh.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductList {
	
	@Id
	private int ProductId; 
	private String nome;
	private double valor;
	private String marca;
	
	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int ProductId) {
		this.ProductId = ProductId;
	}


	public ProductList() { } 
	
	
	public ProductList(String nome, String marca) {
		this.nome = nome;
		this.marca = marca;
	}

	public ProductList(double valor){
		this.valor = valor;
	}

	
	public ProductList(int ProductId, String nome, double valor, String marca) {
		this.ProductId = ProductId; 
		this.nome = nome; 
		this.valor = valor;
		this.marca = marca;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	} 
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	} 
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	} 
}

