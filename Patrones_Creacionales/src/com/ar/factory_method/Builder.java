package com.ar.factory_method;

public abstract class Builder {
	public String nombre;
	public Float peso;
	public Float altura;
	
	
	public abstract Animal build();


	public String getNombre() {
		return nombre;
	}


	public Builder nombre(String nombre) {
		this.nombre = nombre;
		return this;
	}



	public Builder peso(Float peso) {
		this.peso = peso;
		return this;
	}



	public Builder altura(Float altura) {
		this.altura = altura;
		return this;
	}
	
}
