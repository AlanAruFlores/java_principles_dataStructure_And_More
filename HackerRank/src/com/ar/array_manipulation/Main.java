package com.ar.array_manipulation;
import java.util.*;



public class Main {
    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

	
	//First way to solve
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
    // Write your code here
        //Init     
        List<Integer> lastArray = getArrayOfZeros(n);
        
        queries.forEach(list->{
          for(int i = list.get(0)-1 ; i < list.get(1) ; i++)
                lastArray.set(i,lastArray.get(i)+list.get(2));
               
        });
        
        return lastArray.stream().distinct().max(Integer::compareTo).get();
    }
    
    
    //Second way to make

    public static long arrayManipulation2(int n, List<List<Integer>> queries) {
    // Write your code here
        //Init     
        long[] lastArray = new long [n];
    
        queries.forEach(list->{
        
          for(int i = list.get(0)-1; i < list.get(1) ; i++)
                lastArray[i] = lastArray[i]+list.get(2);
           
        });          
        long max = 0;
        for(long number : lastArray)
            max = Math.max(max,number);
        
        
        //return Arrays.stream(lastArray).boxed().max(Long::compareTo).get();
    
        return max;
    }
    
    public static List<Integer> getArrayOfZeros(int length){
        List<Integer> arrayZeros = new ArrayList<>();
        
        for(int i = 0 ; i < length; i++)
            arrayZeros.add(0);
        
        return arrayZeros;
    }
}
