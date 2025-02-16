package com.ar.apple_and_orange;
import java.util.*;
public class Main {
    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
        
        
        
        int countApples = (int) apples.stream().map(apple-> apple + a). filter(apple-> (apple>= s && apple <= t)).count();
        int countOranges = (int) oranges.stream().map(orange-> orange + b). filter(orange-> (orange>= s && orange <= t)).count();
        
        System.out.println(countApples);
        System.out.println(countOranges);
        
        
    }

}
