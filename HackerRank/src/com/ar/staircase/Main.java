package com.ar.staircase;

public class Main {
	   /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
        for(int i = 1 ; i <= n ; i++){
            int blankSpaces = n-i;
            printNCharacter(blankSpaces, " ");
            printNCharacter(i, "#");
            System.out.println("");
        }
    }
    
    public static void printNCharacter(int c, String ch){
        for(int i = 0 ; i < c ; i++)    
            System.out.print(ch);
    }

}
