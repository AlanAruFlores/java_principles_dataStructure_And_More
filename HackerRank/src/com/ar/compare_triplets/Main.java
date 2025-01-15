package com.ar.compare_triplets;

import java.util.*;

public class Main {

	 /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> pointsForAliceBob = new ArrayList<>();
        pointsForAliceBob.add(0,0);
        pointsForAliceBob.add(1,0);
        

        for(int i  = 0 ; i < 3 ; i++){
            if(a.get(i) > b.get(i)){
               pointsForAliceBob.set(0, pointsForAliceBob.get(0) + 1);
            }
            if(a.get(i) < b.get(i)){
               pointsForAliceBob.set(1, pointsForAliceBob.get(1) + 1);    
            }
        }
        
        return pointsForAliceBob;
        
        
    }

}
