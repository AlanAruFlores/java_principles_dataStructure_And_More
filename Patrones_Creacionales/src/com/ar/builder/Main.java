package com.ar.builder;

/**
 * PATRON BUILDER:
 * 
 * El patron de diseño builder viene a separar la complejidad de la construccion de los objetos
 * haciendolo mas limpio y flexible en el codigo
 * 
 */
public class Main {

	public static void main(String[] args) {
		Persona persona = new Persona().Builder()
				.nombre("Alan")
				.edad(21)
				.apellido("Aruquipa")
				.build();
		
		
		System.out.println(persona);
	}
}
