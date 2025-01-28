package com.ar.factory_method;

public class LeonBuilder extends Builder {
	
	@Override
	public Animal build() {
		return new Leon(this);
	}

}
