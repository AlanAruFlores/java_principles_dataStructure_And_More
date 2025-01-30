package com.ar.composite;

import java.util.List;

/*
 * Composite es un patrón de diseño estructural que te permite
 * componer objetos en estructuras de árbol 
 * y trabajar con esas estructuras como si fueran objetos individuales.
 *
 * Es decir, por ejemplo en una caja podemos tener productos
 *  y otras pequeñas cajas que contienen otros productos.
 *  La idea de este patron es poder trabajar con esta estructura 
 *  de arbol como objetos individuales
 *
 *
 */
public class Main {
	public static void main(String[] args) {
		Component hoja1 = new Hoja();
		
		//Composite que contiene otras hojas (similar a una caja)
		Component ch = new CompositeHoja(new Hoja(),new Hoja(), new Hoja()); 
		
		List<Component> componentes = List.of(hoja1, ch);
		
		componentes.forEach(c->{
			c.mostrarHoja();
		});
		
	}
}
