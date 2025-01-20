package com.ar.consumir_api;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//import org.json.JSONObject;

public class Main {
	 public static void main(String[] args) {
	        try {
	            // URL de la API a la que quieres acceder
	            String urlString = "https://pokeapi.co/api/v2/pokemon/ditto";  // Cambia esta URL por la de tu API

	            // Crear un objeto URL a partir de la cadena de URL
	            URL url = new URL(urlString);

	            // Abrir una conexión HTTP
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	            // Configurar el método HTTP (GET, POST, PUT, DELETE, etc.)
	            connection.setRequestMethod("GET");

	            // Establecer cabeceras (si es necesario)
	            connection.setRequestProperty("Accept", "application/json");

	            // Obtener el código de respuesta
	            int responseCode = connection.getResponseCode();
	            System.out.println("Código de respuesta: " + responseCode);

	            // Leer la respuesta si es un código 200 OK
	            if (responseCode == HttpURLConnection.HTTP_OK) {
	                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	                String inputLine;
	                StringBuilder response = new StringBuilder();

	                while ((inputLine = in.readLine()) != null) {
	                    response.append(inputLine);
	                }
	                in.close();
	                
	                /*
	                JSONObject jsonResponse = new JSONObject(response.toString());
	                	String prop1 = jsonResponse.getString("propertieOne")
	                *
	                *
	                */
	                // Imprimir la respuesta de la API
	                System.out.println("Respuesta de la API: " + response.toString());
	            } else {
	                System.out.println("Error en la solicitud: " + responseCode);
	            }

	            // Cerrar la conexión
	            connection.disconnect();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
