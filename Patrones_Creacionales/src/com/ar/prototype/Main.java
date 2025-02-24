package com.ar.prototype;

/**
 * PROTOTYPE:
 * 
 * Prototype es un patrón de diseño creacional que nos permite copiar objetos existentes
 * sin que el código dependa de sus clases.
 * 
 */
public class Main {
	public static void main(String[] args) {
		
		Persona originalInstance = new Persona();
		originalInstance.setId(1);
		originalInstance.setNombre("Karl");
		originalInstance.setApellido("Flores");
		
		System.out.println(originalInstance);
		
		Persona cloneInstance = originalInstance.clone();
		
		System.out.println(cloneInstance);
		
	}
}
