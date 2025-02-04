package com.ar.flyweight;

import java.util.*;

public class Bosque {
	List<Arbol> arboles = new ArrayList<>();
	
	
	public Arbol plantarArbol(int x, int y, String nombre, String color) {
		ArbolTipo  tipo = ArbolFactory.getArbolTipo(nombre, color);
		
		Arbol nuevo = new Arbol(x, y, tipo);
		arboles.add(nuevo);
		
		return nuevo;
	}
	
}
