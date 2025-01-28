package com.ar.factory_method;

public abstract class Animal {
	protected String nombre;
	protected Float peso;
	protected Float altura;
	
	
	public Animal(Builder builder) {
		this.nombre = builder.nombre;
		this.peso = builder.peso;
		this.altura = builder.altura;
	}



	public abstract void comer();

	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Float getPeso() {
		return peso;
	}



	public void setPeso(Float peso) {
		this.peso = peso;
	}



	public Float getAltura() {
		return altura;
	}



	public void setAltura(Float altura) {
		this.altura = altura;
	}



}
