package com.ar.java_loops_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	/*
	 * Print 10 lines of output; each line i (where 1 <= i <= 10 )
	 * contains the result of (N x i) in the form: (N x i = result)
	 * */
	
    public static void printFirst10MultipleNumbersOf(Integer n){
        for(int i = 1 ; i <=10; i++)
            System.out.println(n+" x "+i+" = "+ (n*i));
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        printFirst10MultipleNumbersOf(N);
        bufferedReader.close();
    }
}
