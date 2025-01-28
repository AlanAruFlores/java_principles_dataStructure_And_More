package com.ar.factory_method;

public class JirafaBuilder extends Builder {
	@Override
	public Animal build() {
		return new Jirafa(this);
	}
}
