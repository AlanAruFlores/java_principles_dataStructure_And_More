package com.ar.bridge;

import com.ar.bridge.exception.CanalNoEncendidoException;

public class Televisor implements Dispositivo {
	
	private final int VOLUMEN_MAXIMO = 100;
	private final int CANAL_MAXIMO = 1000;
	
	private int volumen = 0;
	private int nroCanal = 0;
	private boolean encendido = false;
	
	
	
	
	@Override
	public void setVolumen(int volumen) {
		if(!encendido)
			throw new CanalNoEncendidoException();
		
		if(volumen > VOLUMEN_MAXIMO)
			this.volumen = VOLUMEN_MAXIMO;
		else if(volumen < 0)
			this.volumen = 0;
		else
			this.volumen = volumen;	
	}
	
	

	@Override
	public void setNroCanal(int nroCanal) {
		if(!encendido)
			throw new CanalNoEncendidoException();
		
		if(nroCanal > CANAL_MAXIMO)
			this.nroCanal = CANAL_MAXIMO;
		else if(nroCanal < 0)
			this.nroCanal = 0;
		else
			this.nroCanal = nroCanal;
	}

	@Override
	public void prender() {
		this.encendido = true;
	}

	@Override
	public void apagar() {
		this.encendido = false;
	}



	@Override
	public int getVolumen() {
		return this.volumen;
	}



	@Override
	public int getNroCanal() {
		return this.nroCanal;
	}



	@Override
	public boolean getEncendido() {
		return this.encendido;
	}

	
    @Override
    public void verEstado() {
        System.out.println("------------------------------------");
        System.out.println("| I'm TV set.");
        System.out.println("| I'm " + (this.encendido ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + this.volumen + "%");
        System.out.println("| Current channel is " + this.nroCanal);
        System.out.println("------------------------------------\n");
    }
}
