package com.ar.diagonal_difference;


class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int sumFirstDiagonal = 0;
        for(int i = 0 ; i < 3; i++){
            sumFirstDiagonal +=  arr.get(i).get(i);
        }
        
        int sumReverseDiagonal = 0;
        for(int j = 2; j>= 0; j--){
            sumReverseDiagonal += arr.get(Math.abs(j-2)).get(j);
        }
        
        return Math.abs(sumFirstDiagonal-sumReverseDiagonal);
    }

}


public class Main {
	public static void main(String[] args) {
		
	}
}
