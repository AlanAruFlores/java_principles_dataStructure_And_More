package com.ar.min_max_sum;

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
}
