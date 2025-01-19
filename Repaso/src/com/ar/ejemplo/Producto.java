package com.ar.ejemplo;

public class Producto {
	
	private static int DCTO = 20; // class variable
	
	private Integer id; //instance variable
	private String titulo;
	private String descripcion;
	private Float precio;
	
	
	public Producto(Integer id, String titulo, String descripcion, Float precio) {
		///....
	}
	
	
	public Producto() {	 // Constructor
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
