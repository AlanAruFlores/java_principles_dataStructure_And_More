package com.ar.abstract_factory;

public class ModernoFactory implements AbstractFactory{
	static SillaBuilder smBuilder = new SillaModernaBuilder();
	static MesaBuilder mmBuilder = new MesaModernaBuilder();
	
	@Override
	public Silla crearSilla() {
		return smBuilder.build();
	}

	@Override
	public Mesa crearMesa() {
		return mmBuilder.build();
	}

}
