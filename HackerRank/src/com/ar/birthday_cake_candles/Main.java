package com.ar.birthday_cake_candles;

import java.util.List;

public class Main {
	 /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    	//Getting the max candle
        Integer maxCandle = candles.stream()
                            .max(Integer::compareTo)
                            .get();
        
        
        //Count the candles
        Integer countsCandle = (int) candles.stream()
                                .filter(c -> c.intValue() == maxCandle.intValue()).count();  
                                
        return countsCandle;                 
        
    }
}
