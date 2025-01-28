package com.ar.abstract_factory;

public class SillaModernaBuilder implements SillaBuilder{

	@Override
	public Silla build() {
		return new SillaModerna();
	}

}
