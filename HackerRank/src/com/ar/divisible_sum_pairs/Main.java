package com.ar.divisible_sum_pairs;

import java.util.List;

public class Main {
    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
        Integer count = 0;
        Integer aux = 0;
        
        for(int i = 0 ; i < n-1 ; i++){
            
            for(int j = i+1 ; j < n; j++){
                aux = ar.get(i) + ar.get(j);
                if(aux%k == 0)            
                    count++;
            }
            
        }
        
        return count;
    }
}
