package com.ar.factory_method;

/*
 * Factory Method
 * 
 * Factory Method es un patrón de diseño creacional que proporciona 
 * una interfaz para crear objetos en una superclase, mientras permite
 * a las subclases alterar el tipo de objetos que se crearán.
 * 
 */
public class Main {
	
	
	public static void main(String[] args) {
		AnimalFactory jirafaFactory = new JirafaFactory();
		AnimalFactory leonFactory = new LeonFactory();
		
		
		Animal jirafa = jirafaFactory.crearAnimal();
		Animal leon = leonFactory.crearAnimal();
		
		jirafa.comer();
		leon.comer();
		
		
	}
}
