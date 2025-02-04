package com.ar.flyweight;

//Objeto intrinseco
public class ArbolTipo {
	private String nombre;
	private String color;
	
	
	public ArbolTipo(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "ArbolTipo [nombre=" + nombre + ", color=" + color + "]";
	}
	
}
