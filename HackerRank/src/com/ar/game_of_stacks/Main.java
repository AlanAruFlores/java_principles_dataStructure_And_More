package com.ar.game_of_stacks;
import java.util.*;
public class Main {
	 /*
     * Complete the 'twoStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER maxSum
     *  2. INTEGER_ARRAY a
     *  3. INTEGER_ARRAY b
     */

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
    // Write your code here
        Collections.reverse(a);
        Collections.reverse(b);

        Stack<Integer> stackA =  new Stack<>();
        stackA.addAll(a);
        Stack<Integer> stackB = new Stack<>();
        stackB.addAll(b);
        
        
        boolean flag = false;
        int resultSum  = 0;
        int countSum =  0;
        
        //counts
        int i = stackA.size()-1;
        int j = stackB.size()-1;
        
        while(resultSum < maxSum){
            
            if(i >= 0 && j >= 0)
            {    
                if(stackA.get(i) > stackB.get(j)){
                    flag = true;    
                    j--;
                }else{
                    flag = false;
                    i--;
                }
                
                if(!flag){
                    resultSum += stackA.pop();
                }
                else{
                    resultSum +=  stackB.pop();     
                } 
                
            }
            else if(stackA.isEmpty() && stackB.isEmpty()){
               break; 
            }
            else{
                resultSum += i < 0 ? stackB.pop() : stackA.pop(); 
            }
            countSum++;
                     
        }

        return --countSum;
    }

}
