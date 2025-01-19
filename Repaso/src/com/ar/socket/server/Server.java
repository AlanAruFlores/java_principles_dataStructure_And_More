package com.ar.socket.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket serverSocket;
	private Socket clientSocket;
	
	
	private PrintWriter out;
	private BufferedReader input;

	
	private final Integer PORT;
	public Server(final Integer port) {
		PORT = port;
		
	}
	
	public void start() {
		try {
			serverSocket = new ServerSocket(PORT);
			clientSocket = serverSocket.accept();
			
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			input  = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			//Here im waiting for a message by the client
			String message = input.readLine();
			System.out.println("CLIENT: "+message);
			
			if(message.contains("Hola")) {
				out.println("Hola cliente");
			}
			else {
				out.println("Mensaje Recibido desde el servidor");
			}
			
			
			
					
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public void stop() {
		try {
			input.close();
			out.close();
			clientSocket.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
