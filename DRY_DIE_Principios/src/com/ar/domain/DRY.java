package com.ar.domain;

public class DRY {
	
	public static void execute() {
		Integer numberOne = 4, numberTwo = 10;
		
		getTheResultOfNumberToThePowerOf(numberOne, 3);
		getTheResultOfNumberToThePowerOf(numberTwo, 4);
	
	}
	
	private static void getTheResultOfNumberToThePowerOf(int number, int power) {
		/*How we can see here, we are simplifying the logic of the code and
		 * also we are making more reusable:*/
		int result = 1;
		for(int i = 0; i < power ; i++) {
			result *= number;
		}
		System.out.println("The result is: "+result);
	}
	
}
