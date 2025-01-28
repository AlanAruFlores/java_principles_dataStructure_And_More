package com.ar.factory_method;

public class LeonFactory extends AnimalFactory{

	static LeonBuilder leonBuilder = new LeonBuilder();
	
	
	@Override
	public Animal crearAnimal() {
		return leonBuilder
				.nombre("Leon")
				.altura(24.4f)
				.peso(24.4f)
				.build();
	}

}
