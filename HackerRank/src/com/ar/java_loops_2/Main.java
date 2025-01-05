package com.ar.java_loops_2;

import java.util.Scanner;
/*
 * 
 * (a + 2^0. b), (a + 2^0. b + 2^1.b), ... ,(a + 2^0. b + 2^1.b + 2^N.b)
 *   
 * You are given queries 'q' in the form of 'a','b', and 'n'. For each query, print the series corresponding
 * to the given 'a','b' , and 'n' values as a single line of 'n' space-separated integers.
 * 
 * */
public class Main {
	 public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            
	            //Por cada operacion, sacamos las series de cada numero
	            for(int j = 0 ; j < n; j++){
	                int number = a + getResultOfTheSeries(b,j);
	                System.out.print(number+" ");
	            }
	            System.out.println();
	        }
	        in.close();
	    }
	    
	    public static int getResultOfTheSeries(int b, int n){
	        int result = 0;
	        for(int i = 0; i <= n; i++)
	            result += b * Math.pow(2, i);
	        
	        return result;
	    }
}
