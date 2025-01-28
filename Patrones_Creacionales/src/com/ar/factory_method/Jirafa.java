package com.ar.factory_method;

public class Jirafa extends Animal{

	public Jirafa(JirafaBuilder builder) {
		super(builder);
	}



	@Override
	public void comer() {
		System.out.println("La jirafa come plantas");
	}	


}
