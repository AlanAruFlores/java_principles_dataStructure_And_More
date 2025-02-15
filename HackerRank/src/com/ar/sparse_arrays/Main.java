package com.ar.sparse_arrays;
import java.util.*;
public class Main {
    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY stringList
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
    // Write your code here
        List<Integer> results = new ArrayList<>();
        
        queries.forEach((q)->{
            results.add((int)stringList.stream().filter(s-> s.equalsIgnoreCase(q)).count());    
        });
        
        
        return results;
    }

}
