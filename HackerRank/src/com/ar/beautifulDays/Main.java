package com.ar.beautifulDays;
import java.util.*;
import java.util.stream.Stream;
public class Main {
	 /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */
    public static int beautifulDays(int i, int j, int k) {
       int count = 0;
        for(int n  = i ; n <= j ; n++){
            List<String> reverseStringList = Arrays.asList(String.valueOf(n).split(""));
            
            Collections.reverse(reverseStringList);
            
            String reverseString = Stream.of(reverseStringList).collect(Collectors.joining(""));
            
            int value = Integer.parseInt(reverseString);
             
            
            if(!String.valueOf(Math.abs((n-value) / 6)).matches("[-+]?[0-9]*\\.?[0-9]+")){
                count++;
            }
        }
        
        return count;
    }
}
