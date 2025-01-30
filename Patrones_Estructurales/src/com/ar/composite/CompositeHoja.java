package com.ar.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeHoja implements Component{
	private List<Hoja> hijos = new ArrayList<>();
	
	public CompositeHoja() {
		
	}
	
	public CompositeHoja(Hoja... hojas) {
		add(hojas);
	}
	
	public void add(Hoja... hojas) {
		this.hijos.addAll(Arrays.asList(hojas));
	}

	@Override
	public void mostrarHoja() {
		this.hijos.forEach(h->{
			h.mostrarHoja();
		});
	}
	
}
