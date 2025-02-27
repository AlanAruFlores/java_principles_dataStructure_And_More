package todocode.empresa_vuelos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		int [][] data = loadData();
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		int targetOption  = 0;
		int flyOption  = 0;
		try {
			String endString = "";
			do {
				do {
					System.out.println("INGRESAR EL NUMERO DEL DESTINO (1-6):");
					targetOption = Integer.parseInt(buffer.readLine());
					
					System.out.println("INGRESAR EL NUMER DEL VUELO (1-3)");
					flyOption =Integer.parseInt(buffer.readLine());
					
				}while( (targetOption < 1 || targetOption > 6) || (flyOption < 1 || flyOption > 3));
				targetOption--;
				flyOption--;
				
				
				int seatCounts = 0;
				System.out.println("INGRESE LA CANTIDAD DE ASIENTOS A RESERVAR");
				seatCounts = Integer.parseInt(buffer.readLine());
				
				int numberOfSeats = data[targetOption][flyOption];
				
				if(seatCounts <= numberOfSeats) {
					data[targetOption][flyOption] = numberOfSeats - seatCounts;
					System.out.println("FUE RESERVADO CON EXITO");
				}else {
					System.err.println("ERROR, NO SE PUDO CUMPLIR LA OPERACION");
				}
				
				System.out.println("DESEA TERMINAR? INGRESE FINISH");
				endString = buffer.readLine();
				
			}while(!endString.equalsIgnoreCase("finish"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static int[][] loadData(){
		int [][] data = {
				{
					120,15,30
				},
				{
					65,1,2
				},
				{
					4,52,7
				},
				{
					46,32,16
				},
				{
					61,23,11
				},
				{
					61,12,91
				}
		};	
		return data;
	}
}
