package com.ar.factory_method;

public abstract class AnimalFactory {

	
	public void verQueCome() {
		Animal animal = crearAnimal();
		animal.comer();
	}
	
	public abstract Animal crearAnimal();
	
}
