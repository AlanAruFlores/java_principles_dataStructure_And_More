package com.ar.array_ds;
import java.util.*;

public class Main {
    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
        List<Integer> reverseArray = new ArrayList<>();
        
        
        //First way:
        /*
        for(int i = a.size()-1 ; i >= 0 ; i--)
            reverseArray.add(a.get(i));    
        */
        //Second way
        Collections.reverse(a);
        
        return a;
    }

}
