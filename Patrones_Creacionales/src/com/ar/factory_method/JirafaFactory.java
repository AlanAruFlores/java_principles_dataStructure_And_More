package com.ar.factory_method;

public class JirafaFactory extends AnimalFactory{
	static JirafaBuilder jirafaBuilder = new JirafaBuilder();
	
	
	@Override
	public Animal crearAnimal() {
		return jirafaBuilder
				.nombre("Jirafa")
				.altura(24.4f)
				.peso(24.4f)
				.build();
	}

}
