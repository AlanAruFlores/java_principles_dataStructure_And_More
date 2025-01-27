package com.ar.migratory_birds;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
        Map<Integer,Integer> countSighted = new HashMap<Integer, Integer>();
        
        for(Integer i : arr.stream().distinct().collect(Collectors.toList())){
            countSighted.put(i,
                (int)
                (    arr.stream()
                    .filter(a -> a == i)
                    .count()
                ) 
            );
        }
        
        Integer maxOcurrences = countSighted.values().stream()
        .max(Integer::compareTo).get();
        
        List<Integer> numbersMoreSighted = new ArrayList<>();
    
    countSighted.forEach( (k, v) -> 
     {
        if(v == maxOcurrences)
            numbersMoreSighted.add(k);
     } );
    
    return numbersMoreSighted.stream().min(Integer::compareTo).get();
        
    }

}
