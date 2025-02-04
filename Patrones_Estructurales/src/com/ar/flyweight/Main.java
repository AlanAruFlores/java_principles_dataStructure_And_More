package com.ar.flyweight;

/*
 * Patron Flyweight:
 * 
 * es un patrón de diseño estructural que te permite mantener más 
 * objetos dentro de la cantidad disponible de RAM compartiendo las 
 * partes comunes del estado entre varios objetos
 * 
 * El estado del objeto  se compone de un componente invariante
 *  compartido con otros objetos similares (intrinseco) y un componente 
 *  variante que puede ser manipulado por el código del cliente (extrínseco).
 * 
 * Imaginemos que desarrolle un videojuego con miles particulas
 * donde cada una de estas tienen sus propiedades individuales
 * y donde se guardan en un espacio en memoria.
 * Si bien puede andar en nuestra computadora, puede que en otras
 * de menos potencia no les funcione y esto se debe a la sobrecarga
 * a la memoria RAM.
 * 
 * Este patron viene a ligerar el peso de la memoria RAM
 * donde los objetos individuales van a tener otros objetos compartidos
 * 
 * 
 * */

public class Main {
	public static void main(String[] args) {
		Bosque bosque = new Bosque();
		
		Arbol arbol1 = bosque.plantarArbol(1, 10, "Roble", "Blanco");
		Arbol arbol2 = bosque.plantarArbol(41, 10, "Roble", "Blanco");

		System.out.println(arbol1);
		System.out.println(arbol2);
		
	}
}
