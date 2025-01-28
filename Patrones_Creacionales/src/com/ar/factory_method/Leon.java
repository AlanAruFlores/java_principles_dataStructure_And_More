package com.ar.factory_method;

public class Leon extends Animal{

	public Leon(LeonBuilder builder) {
		super(builder);
	}
	
	@Override
	public void comer() {
		System.out.println("Leon come carne..");
	}
	

}
