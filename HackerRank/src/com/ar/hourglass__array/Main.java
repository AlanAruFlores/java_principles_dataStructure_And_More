package com.ar.hourglass__array;
import java.util.*;
public class Main {
	 /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
       
        List<Integer> hourGlassesSum  = new ArrayList<>();
       
        ciclo : for(int i = 0 ; i< arr.size(); i++) // filas
        {
            if((i + 2) >= arr.size())
                break ciclo;
            
            int rowEnd = (i + 3) - 1;
            
            for(int j = 0  ; j < arr.get(0).size() - 2; j++){
                int colEnd  = (j + 3 ) -1;
                int number  = getValueOfHourGlass(i, rowEnd, j, colEnd, arr);
                hourGlassesSum.add(number);
            }
        }
        
        
        return hourGlassesSum.stream().max(Integer::compareTo).get();
    }
    
    public static int getValueOfHourGlass(int rowStart, int rowEnd, int colStart, int colEnd,List<List<Integer>> arr){
        
        int hourGlass = 0 ;
        
        for(int i  = rowStart; i <= rowEnd; i++){    
            for(int j  = colStart ; j <= colEnd; j++){
                if(i == (rowStart+1) && j == (colStart+1) )
                    hourGlass += arr.get(i).get(j);
                if(i != (rowStart+1))
                    hourGlass += arr.get(i).get(j);
            }  
        }
        return hourGlass;
    }

}
