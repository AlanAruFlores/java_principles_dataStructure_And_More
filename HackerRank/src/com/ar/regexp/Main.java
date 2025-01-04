package com.ar.regexp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/*
 * 
 * Write a class called MyRegex which will contain a string pattern.
 * You need to write a regular expression and assign it to the pattern 
 * such that it can be used to validate an IP address. 
 * Use the following definition of an IP address:
 *
 * */

public class Main {
    public static void main(String[] args){

    	 String[] ipAddresses = {
    	            "259.259.259.259",
    	            "266.266.266.266",
    	            "255.255.255.255",
    	            "555.555.555.555",
    	            "666.666.666.666",
    	            "249.249.249.249",
    	            "249.249.249.256"
    	        };
    	 
    	 for(String ip : ipAddresses) {
              System.out.println(ip.matches(new MyRegex().pattern));
    	 }
    }
}

//Write your code here
class MyRegex{
    String pattern;
    
    public MyRegex(){
        this.pattern = "([0-9]|[0-9][0-9]|[0-2][0-4][0-9]|25[0-5])."
        		+ "([0-9]|[0-9][0-9]|[0-2][0-4][0-9]|25[0-5])."
        		+ "([0-9]|[0-9][0-9]|[0-2][0-4][0-9]|25[0-5])."
        		+ "([0-9]|[0-9][0-9]|[0-2][0-4][0-9]|25[0-5])";
    }
}

