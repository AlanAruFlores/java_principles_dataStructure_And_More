package com.ar.builder;

public class Builder {
	
	private Persona object;
	
	public Builder(Persona persona) {
		this.object = persona;
	}
	
	public Builder nombre(String nombre) {
		this.object.setNombre(nombre);
		return this;
	}
	
	public Builder apellido(String apellido) {
		this.object.setApellido(apellido);
		return this;
	}
	
	public Builder edad(int edad) {
		this.object.setEdad(edad);
		return this;
	}

	public Persona build() {
		return this.object;
	}
	
	
}
