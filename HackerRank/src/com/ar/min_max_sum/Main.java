package com.ar.min_max_sum;

import java.util.List;

public class Main {
    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
   
        Integer minNumberArr = arr.stream()
            .min(Integer::compareTo).get();
        Integer maxNumberArr = arr.stream()
            .max(Integer::compareTo).get();
        
        
        Long min , max;
        if(minNumberArr != maxNumberArr){
        
             min = arr.stream().filter(n -> n != maxNumberArr)
                    .mapToLong(Integer::longValue)
                    .reduce(0L, (a,b)->  a + b);
             max = arr.stream().filter(n -> n != minNumberArr)
                    .mapToLong(Integer::longValue)
                    .reduce(0L, (a,b)-> a+b);
        }else{
        	//If I have 5 integers with the same value, we need to only to sum the values and then make the minus operation
            max = min = arr.stream().mapToLong(Integer::longValue)
             .reduce(0L, (a,b)-> a+b) - maxNumberArr;
        }
        
        System.out.print(min+" "+ max);
        
    }
    
    
    
    /* Another Way:
     * 
     *	Long min, max;
        
        min = arr.stream()  
                .map(Integer::longValue)
                .min(Long::compareTo).get();
        
        max = arr.stream()
                .map(Integer::longValue)
                .max(Long::compareTo).get();
                
        
        Long maxSum = 0L;
        Long minSum = 0L;  
        if(max != min){
            maxSum =  arr.stream()
                    .map(Integer::longValue)
                    .filter(x-> x.longValue() != min.longValue())
                    .reduce(0L, (a,b)->a+b);
            
            minSum = arr.stream()
                    .map(Integer::longValue)
                    .filter(x-> x.longValue() != max.longValue())
                    .reduce(0L, (a,b)->a+b);   
        }else{
            minSum = maxSum = arr.stream()
                            .map(Integer::longValue)
                            .reduce(0L, (a,b) -> a.longValue()+b.longValue()) - max;
        }
        
        System.out.println(minSum+" "+maxSum);
        
     * 
     * */
}
