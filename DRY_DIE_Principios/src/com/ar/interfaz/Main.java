package com.ar.interfaz;

import java.util.Scanner;

import com.ar.domain.DRY;
import com.ar.domain.NoDRY;

public class Main {
	
	/*DRY (DONT REPEAT YOURSELF) is a principle 
	 * that help us to keep in out mind should not duplicate
	 * code because this can gives maintenance issues*/
	
	public static void main(String[] args) {
		/*WITHOUT DRY*/
		//NoDRY.execute();
		
		/*WITH DRY APPROACH*/
		DRY.execute();
	}
	
	/*DIE (Duplication is Evil) is similar to DRY but it takes one step 
	 * forward to avoid the duplication in our code.*/
}
