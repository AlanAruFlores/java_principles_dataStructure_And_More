package com.ar.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
	static Map<String , ArbolTipo> arbolTipoCache = new HashMap<>();
	
	
	public static ArbolTipo getArbolTipo(String nombre, String color) {
		
		//Busca por nombre, sino la agrega al mapa
		ArbolTipo arbolTipo  = arbolTipoCache.computeIfAbsent(nombre, 
				nuevoNombre -> {
					ArbolTipo nuevoArbolTipo = new ArbolTipo(nuevoNombre, color);
					return nuevoArbolTipo;
				});
		return arbolTipo;
	}
	
	
}
