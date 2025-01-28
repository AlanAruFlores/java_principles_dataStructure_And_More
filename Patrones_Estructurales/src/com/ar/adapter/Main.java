package com.ar.adapter;

public class Main {
	/*
	 * Adapter es un patrón de diseño estructural que permite 
	 * la colaboración entre objetos con interfaces incompatibles.
	 * */
	
	
	public static void main(String[] args) {
		CirculoAgujero agujero = new CirculoAgujero(10);
		CirculoPieza piezaCirculo = new CirculoPieza(8);
		
		
		System.out.println("CIRCULO: ");
		verificarSiEncaja(agujero, piezaCirculo);
		
		System.out.println("CUADRADO: ");
		CuadradoPieza cuadradoPieza = new CuadradoPieza(8);
		CuadradoPiezaAdapter cuadradoAdapter = new CuadradoPiezaAdapter(cuadradoPieza);
		verificarSiEncaja(agujero, cuadradoAdapter);
		
		
		
	}
	
	public static void verificarSiEncaja(CirculoAgujero agujero, CirculoPieza piezaCirculo) {
		if(agujero.entra(piezaCirculo))
			System.out.println("ENTRO");
		else {
			System.out.println("NO ENTRO EL CIRCULO");
		}
		
		
	}
}
