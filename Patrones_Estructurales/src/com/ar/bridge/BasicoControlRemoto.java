package com.ar.bridge;

public class BasicoControlRemoto implements ControlRemoto {

	Dispositivo dispositivo;
	
	public BasicoControlRemoto(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	@Override
	public void subirVolumen() {
		dispositivo.setVolumen(dispositivo.getVolumen()+1);
	}

	@Override
	public void bajarVolumen() {
		dispositivo.setVolumen(dispositivo.getVolumen()-1);	
	}

	@Override
	public void subirCanal() {
		dispositivo.setNroCanal(dispositivo.getNroCanal()+1);
	}

	@Override
	public void bajarCanal() {
		dispositivo.setNroCanal(dispositivo.getNroCanal()-1);
	}

	@Override
	public void encenderDispositivo() {
		dispositivo.prender();
	}

	@Override
	public void apagarDispositivo() {
		dispositivo.apagar();
	}

}
