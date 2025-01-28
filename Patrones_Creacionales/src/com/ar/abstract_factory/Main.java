package com.ar.abstract_factory;

/*
 * Abstract Factory
 * Es otro patron de diseño creacional, que permite la creacion
 * de varios objetos relacionados
 */
public class Main {
	
	static AbstractFactory antFactory = new AntiguoFactory();
	static AbstractFactory modFactory = new ModernoFactory();
	
	public static void main(String[] args) {
		
		
		/* OBJETOS ANTIGUOS */
		Silla sillaAntigua =  antFactory.crearSilla();
		Mesa mesaAntigua = antFactory.crearMesa();
		
		sillaAntigua.sentarse();
		mesaAntigua.limpiar();
		
		
		/* OBJETOS MODERNOS */
		Silla sillaModerna = modFactory.crearSilla();
		Mesa mesaModerna = modFactory.crearMesa();
		
		sillaModerna.sentarse();
		mesaModerna.limpiar();
		
	}

}
