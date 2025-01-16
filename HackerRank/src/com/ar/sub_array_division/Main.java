package com.ar.sub_array_division;

import java.util.List;

public class Main {
	/*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
        Integer countDiv = 0;
        
        ciclo: for(int i = 0 ; i < s.size() ; i++){
            Integer sum = 0 ;
            if((i+(m-1)) >= s.size())
                break ciclo;
                
            for(int j = 0 ; j < m; j++){
                sum += s.get(i+j);
            }
            
            if(sum == d)
                countDiv++;
        }
        
        return countDiv;
    }
}
