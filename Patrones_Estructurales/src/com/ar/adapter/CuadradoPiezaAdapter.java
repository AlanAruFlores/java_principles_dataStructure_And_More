package com.ar.adapter;

public class CuadradoPiezaAdapter extends CirculoPieza {

	private CuadradoPieza cuadradoPieza;
	
	public CuadradoPiezaAdapter(CuadradoPieza cuadradoPieza) {
		super();
		this.cuadradoPieza = cuadradoPieza;
	}
	
	/*
	 * Obtenemos el radio de un cuadrado para adaptarlo al circulo pieza
	 * */
	@Override
	public double getRadio() {
		return (Math.sqrt(Math.pow((cuadradoPieza.getAncho() / 2), 2) * 2));
	}

}
