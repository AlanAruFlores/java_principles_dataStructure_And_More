package com.ar.picking_numbers;
import java.util.*;
public class Main {
    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
       
       List<Integer> results = new ArrayList<>();
       
       //Por cada elelemento, hago un sub array y las mando a results
       for(Integer n : a ){
         int count = (int) a.stream().filter( x -> (x >= n && Math.abs(x-n) <= 1))
         .count();
              
         results.add(count);
       

       }
       return results.stream().max(Integer::compareTo).get();
    }
}
