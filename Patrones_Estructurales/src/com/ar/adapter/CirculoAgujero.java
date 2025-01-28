package com.ar.adapter;

public class CirculoAgujero {
	private double radio;
	
	public CirculoAgujero(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public boolean entra(CirculoPieza pieza) {
		return this.radio >= pieza.getRadio();
	}
	
}
