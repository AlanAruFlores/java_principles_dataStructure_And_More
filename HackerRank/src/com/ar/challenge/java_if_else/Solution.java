package com.ar.challenge.java_if_else;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
 * Given an integer, perform the following conditional actions:
	
	If is odd, print Weird
	If is even and in the inclusive range 	of 2 to 5, print Not Weird
	If is even and in the inclusive range of 6 to 20, print Weird
	If is even and greater than 20, print Not Weird
	
	Complete the stub code provided in your editor to print whether or not
	is weird.
 * */
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N % 2 != 0)
        	System.out.println("Weird");
        else {
        	if(isOnTheRange(2, 5, N))
        		System.out.println("Not Weird");
        	else if(isOnTheRange(6, 20, N))
        		System.out.println("Weird");
        	else if(N > 20)
        		System.out.println("Not Weird");
        	
        }
        
        
        scanner.close();
    }
    
    
    public static boolean isOnTheRange(int min, int max, int number) {
    	return number >=min &&  number <= max;
    }
}
