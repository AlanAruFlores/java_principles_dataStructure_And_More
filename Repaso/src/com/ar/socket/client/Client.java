package com.ar.socket.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	private Socket clientSocket;
	private PrintWriter out;
	private BufferedReader input;
	
	private final Integer PORT;
	private final String IP_ADDRESS;
	
	public Client(final Integer port, final String ip) {
		this.PORT = port;
		this.IP_ADDRESS = ip;
	}
	
	
	public void start() {
		try {
			clientSocket = new Socket(IP_ADDRESS, PORT);
			out = new PrintWriter(clientSocket.getOutputStream());
			input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			out.println("Hola Servidor !!");
			
			String response = input.readLine();
		
			System.out.println("SERVER: "+response);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void stop() {
		try {
			out.close();
			input.close();
			clientSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
