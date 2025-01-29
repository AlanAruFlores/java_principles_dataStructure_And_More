package com.ar.bridge.exception;

public class CanalNoEncendidoException extends RuntimeException {
	public CanalNoEncendidoException() {
		super("El Canal no esta encendido");
	}
}
