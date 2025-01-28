package com.ar.abstract_factory;

public class MesaModernaBuilder implements MesaBuilder{

	@Override
	public Mesa build() {
		return new MesaModerna();
	}

}
