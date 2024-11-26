package com.ar.domain;


public class NoDRY {
	
	public static void execute() {

		Integer numberOne = 4, numberTwo = 10;
		Integer numberOneTo3 = 1, numberTwoTo4 = 1;
		
	
		
		/*How we can see here, we are repeat the code to get the result
		 * of the number to power of N. It works, but 
		 * this is not a good practice because imagine to get 10 differents
		 * numbers, then you need to get the results of them. So we are getting
		 * maintenance problems.*/
		
		for(int i = 0; i < 3 ; i++) {
			numberOneTo3 *= numberOne;
		}
		
		System.out.println("The result is: "+numberOneTo3);
		
		
		for(int i = 0; i < 4 ; i++) {
			numberTwoTo4 *= numberTwo;
		}
		

		System.out.println("The result is: "+numberTwoTo4);
		
	}
}
