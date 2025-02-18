package com.ar.largest_rectangle;
import java.util.*;

public class Main {

    /*
     * Complete the 'largestRectangle' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY h as parameter.
     */

    public static long largestRectangle(List<Integer> h) {
    // Write your code here
        Stack<Integer> valuesTemp = new Stack<>();
        
        long largestRectangleResult = 0l;
        
        for(int i = 0 ; i < h.size(); i++){
            
            //Evaluamos en adelante
            cicloCreciente: for(int j = i ; j < h.size(); j++){    
                if(h.get(j) >= h.get(i)){
                    valuesTemp.push(h.get(i));
                }
                else{
                    break cicloCreciente;
                }
                
            }
            
            //Evaluamos desde atras
            cicloDecreciente: for(int j = i-1; j>= 0; j--){
                if(h.get(j) >= h.get(i)){
                    valuesTemp.push(h.get(i));
                }
                else{
                    break cicloDecreciente;
                }
            }
            
            largestRectangleResult = (long) Math.max(largestRectangleResult,getStackSum(valuesTemp));
            
            valuesTemp.clear();
        }    
        return largestRectangleResult;
    }
    
    public static long getStackSum(Stack<Integer> stack){
        long result  = 0l;    
        while(stack.size() > 0){
            result += stack.pop();
        }
        return result;
    }
}
