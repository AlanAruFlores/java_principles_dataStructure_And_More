package com.ar.singleton;

/**
 * SINGLETON:
 * 
 * patrón de diseño creacional que nos permite asegurarnos de que una clase tenga una única instancia,
 * a la vez que proporciona un punto de acceso global a dicha instancia.
 */
public class Main {
	public static void main(String[] args) {
		ClassSingleton instance = ClassSingleton.getInstance("1234");
		
		System.out.println("EL VALOR DEL INSTANCE: "+instance.getValue());;
		
	}
}
