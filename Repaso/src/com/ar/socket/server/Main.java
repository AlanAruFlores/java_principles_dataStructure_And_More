package com.ar.socket.server;

public class Main {
	
	public static void main(String[] args) {
		Server server  = new Server(8888);
		server.start();
		server.stop();
	}
}
