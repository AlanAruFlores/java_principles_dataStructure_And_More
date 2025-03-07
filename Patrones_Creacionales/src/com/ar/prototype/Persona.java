package com.ar.prototype;

public class Persona {
	private Integer id;
	private String nombre;
	private String apellido;
	
	public Persona() {
		
	}
	
	public Persona(Persona p) {
		this.id = p.id;
		this.nombre = p.nombre;
		this.apellido = p.apellido;
	}

	public Persona clone() {
		return new Persona(this);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
}
