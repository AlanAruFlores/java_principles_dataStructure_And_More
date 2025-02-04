package com.ar.flyweight;

//Objeto extrinseco
public class Arbol {
	private int x;
	private int y;
	
	private ArbolTipo tipo;

	public Arbol(int x, int y, ArbolTipo tipo) {
		super();
		this.x = x;
		this.y = y;
		this.tipo = tipo;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ArbolTipo getTipo() {
		return tipo;
	}

	public void setTipo(ArbolTipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Arbol [x=" + x + ", y=" + y + ", tipo=" + tipo + "]";
	}
	
	
}
