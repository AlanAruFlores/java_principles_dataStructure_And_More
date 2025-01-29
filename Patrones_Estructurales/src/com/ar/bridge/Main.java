package com.ar.bridge;

/*
 * BRIDGE
 * 
 * Bridge es un patrón de diseño estructural 
 * que te permite dividir una clase grande, 
 * o un grupo de clases estrechamente relacionadas, 
 * en dos jerarquías separadas.
 * 
 * Dentro de este patron tendremos 2 partes importantes:
 * 1..Abstraccion
 * 2..Implementacion
 * 
 * ¿Diferencia?
 * La diferencia entre ellos es que la "Abstraccion" define
 * una capa de alto nivel , el cual delega el trabaja a la capa de 
 * "Implementacion"
 * 
 * Implementacion es quien se le delega el trabajo
 * 
 * 
 * Esto quiere decir que la abstraccion va a definir funcionalidad complejas
 * donde mayoritariamente las hace la implementacion.
 * 
 * Imaginemos una GUI o interfaz de usuario con un Sistema operativo (Linux)
 * La GUI es la abstraccion donde el cliente ve y realiza acciones. 
 * Cuando la GUI recibe tareas a realizar , las delega al sistema operativo
 * ya quien es el mismo quien esta encargado mayormente de la funcionalidades
 * de un computador.
 * 
 * 
 * Vamos a ver un ejemplo con un remoto y dispositivos
 * 1- donde el control remoto es la abstraccion
 * 2- donde el dispositivo es la implementacion
 * 
 */

public class Main {

	public static void main(String[] args) {
		Dispositivo radio = new Radio();
		ControlRemoto basico = new BasicoControlRemoto(radio);
		basico.encenderDispositivo();
		basico.subirCanal();
		radio.verEstado();
		
		Dispositivo televisor = new Televisor();
		ControlRemoto avanzado = new AvanzadoControlRemoto(televisor);
		avanzado.encenderDispositivo();
		avanzado.subirVolumen();
		avanzado.subirVolumen();
		avanzado.subirVolumen();
		avanzado.subirVolumen();

		televisor.verEstado();
		((AvanzadoControlRemoto) avanzado).mute();
		televisor.verEstado();

	}
	
}
