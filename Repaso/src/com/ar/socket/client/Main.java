package com.ar.socket.client;

public class Main {

	public static void main(String[] args) {
		Client client = new Client(8888, "127.0.0.1");
		client.start();
		client.stop();
		
		
	}
}
