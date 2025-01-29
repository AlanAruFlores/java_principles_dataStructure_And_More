package com.ar.bridge;

public interface Dispositivo {

	void setVolumen(int volumen);
	int getVolumen();
	void setNroCanal(int nroCanal);
	int getNroCanal();
	void prender();
	void apagar();
	boolean getEncendido();
	void verEstado();
	
}
