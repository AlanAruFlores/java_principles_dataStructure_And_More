package com.ar.arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {8,4,10,20};

		/*Is so easy for the computer access the data, because
		 * he need to only mutiply de index with the size of the data due to
		 * all elements have the same size of memory
		 * 
		 * "index * size"
		 * */
		int elementIndex2 = array[2];
		System.out.println(elementIndex2);
		

		/*But if we wanted to delete/add a new value on this kind of data structure
		 * , it would be so difficult, because we need to create a new array and copy the value*/
		
		int elementToDelete = 10;		
		int[] newArray = new int[array.length-1];
		int indexNewArray = 0;
		
		//Create the new array
		for(int i = 0 ; i < array.length; i++) {
			if(array[i] != elementToDelete) {
				newArray[indexNewArray] = array[i];
				indexNewArray++;
			}
		}
		
		//Show the new array
		System.out.println("NUEVO ARREGLO: ");
		for (int i = 0 ; i < newArray.length; i++) {
			System.out.print(newArray[i]+"-");
		}
		
		
	}
}
