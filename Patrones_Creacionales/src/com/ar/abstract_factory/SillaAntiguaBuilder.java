package com.ar.abstract_factory;

public class SillaAntiguaBuilder implements SillaBuilder{

	@Override
	public Silla build() {
		return new SillaAntigua();
	}

}
