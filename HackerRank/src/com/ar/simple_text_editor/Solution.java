package com.ar.simple_text_editor;
import java.io.*;
import java.util.*;

public class Solution {

	static String lastCopy = "";
	static String s = "";
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
    	Integer  q; //quantity of operations to make
          
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Type the quantity of operations that you want to do: ");
        q = scanner.nextInt();
        
        
        
        for(int i = 0; i < q ; i++) {
        	lastCopy = s;
        	int operationId = scanner.nextInt();
        
        	switch(operationId) {
	        	case 1:

	        		System.out.print("a");
	        		String textToAppend = scanner.nextLine();
	        		s= append(textToAppend);
	        		System.out.print("qwqwd");
	        		break;
	        	case 2:
	        		Integer countCharToDelete = scanner.nextInt();
	        		s=deleteTheNLastCharacters(countCharToDelete);
	        		
	        		break;
	        	case 3:
	        		Integer indexForCharToPrint = scanner.nextInt();
	        		print(indexForCharToPrint);
	        		
	        		break;
	        	case 4:
	        		undo();
	        		break;
	        		
	        	default:
	        		break;
	        		
        	}
        }
        
        
 
    }
    
    
    
    public static String append(String toAppend){
        return s+toAppend;
    }
    
    public static String deleteTheNLastCharacters(Integer count){
        char[] chars = s.toCharArray();       
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < chars.length - count; i++) 
        	builder.append(chars[i]);
        
        
        return builder.toString();
    }
    
    public static void print(Integer index) {
    	char character=s.toCharArray()[index-1];
    	System.out.println(character);
    }
    
    public static void undo() {
    	s = lastCopy;
    }
    
    
    
}