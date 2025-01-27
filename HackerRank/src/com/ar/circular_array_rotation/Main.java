package com.ar.circular_array_rotation;
import java.util.*;

public class Main {
	 /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here
        
        Integer[] ordered = new Integer[a.size()];
        
        List<Integer> results = new ArrayList<>();

        Integer current;
        Integer index = 0; 
        current = a.get(0);
        do{
            int aux = index+k;
            
            aux = checkIfIsOutIndex(aux, a);
                       
            ordered[aux] =  current;            
            current = (++index <= a.size()-1 ) ? a.get(index) : null;
        }while(index < a.size());
        
        
        queries.forEach(q->{
            results.add(ordered[q]);
        });    
           
        return results;
    }
    
    public static Integer checkIfIsOutIndex(Integer aux, List<Integer> a){
        
        while(aux > (a.size()-1)){
            aux = aux - a.size();        
        }
        
        return aux ;
    }

}
