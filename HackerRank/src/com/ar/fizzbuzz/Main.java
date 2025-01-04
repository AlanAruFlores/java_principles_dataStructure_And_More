package com.ar.fizzbuzz;

public class Main {
	
	public static void main (String[] args) {
		
		for(int i = 1 ; i < 100; i++) {
			checkingTheMultipleOfTheNumber(i);
		}
		
	}
	
	public static void checkingTheMultipleOfTheNumber(int number) {
		
		if(isMultipleOf(number, 3) && isMultipleOf(number, 5)) 
			System.out.println("FizzBuzz");
		else if(!isMultipleOf(number, 3) && !isMultipleOf(number, 5)) 
			System.out.println(number);
		else {
			printAndMakeConditionalForCheckIfANumberIsMultipleOf(number,3,"Fizz");
			printAndMakeConditionalForCheckIfANumberIsMultipleOf(number,5,"Buzz");	
		}
		
	
	}
	
	public static void printAndMakeConditionalForCheckIfANumberIsMultipleOf(int number, int multipleNumber, String message) {
		if(!isMultipleOf(number, multipleNumber))
			return;
		System.out.println(message);
	}
	
	public static boolean isMultipleOf(int number , int multipleNumber) {
		return number % multipleNumber == 0;
	}

}
