package com.ar.singleton;

public class ClassSingleton {
	private static ClassSingleton singleton;
	private String value;
	
	public ClassSingleton(String value) {
		this.value = value;
	}

	
	public static ClassSingleton getInstance(String value) {
		if(singleton == null) {
			singleton = new ClassSingleton(value);
		}
		
		return singleton;
	}
	
	public String getValue() {
		return this.value;
	}
	
	
}
