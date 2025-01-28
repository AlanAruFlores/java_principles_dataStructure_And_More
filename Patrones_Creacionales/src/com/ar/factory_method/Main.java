package com.ar.factory_method;

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
