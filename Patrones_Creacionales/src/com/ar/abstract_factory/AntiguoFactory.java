package com.ar.abstract_factory;

public class AntiguoFactory implements AbstractFactory{
	static SillaBuilder saBuilder = new SillaAntiguaBuilder();
	static MesaBuilder maBuilder = new MesaAntiguaBuilder();
	
	
	@Override
	public Silla crearSilla() {
		return saBuilder.build();
	}

	@Override
	public Mesa crearMesa() {
		return maBuilder.build();
	}

}
