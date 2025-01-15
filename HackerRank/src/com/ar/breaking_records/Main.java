package com.ar.breaking_records;
import java.util.*;

public class Main {
	  /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> records = new ArrayList<>();
        records.add(0,0);
        records.add(1,0);
        
        Integer max = scores.get(0);  
        Integer min = scores.get(0);  
        
        for(Integer s: scores){
             if(s>max){
                max = s;
                records.set(0, records.get(0)+1);
             }
             if(s<min){
                min = s;
                records.set(1, records.get(1)+1);
             } 
        }
        
        return records;
    }
}
