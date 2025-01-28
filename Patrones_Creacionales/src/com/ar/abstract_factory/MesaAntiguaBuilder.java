package com.ar.abstract_factory;

public class MesaAntiguaBuilder implements MesaBuilder{

	@Override
	public Mesa build() {
		return new MesaAntigua();
	}

}
