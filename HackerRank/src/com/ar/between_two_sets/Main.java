package com.ar.between_two_sets;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
        
        //Get the possible numbers that can be factors of them
        List<Integer> listNum = getPossibleNumbers(a, b);
        
        Integer countFactors = getCountFactors(listNum, a, b);
        
        return countFactors;
        
    }

    public static Integer getCountFactors(List<Integer> listNum, List<Integer> a, List<Integer> b){
        
        List<Integer> arrFactorsIntegerBeing = new ArrayList<>();
        
        
        //1st Process
        for(Integer n : listNum){
           Integer aux = (int) a.stream().filter(i -> n % i == 0).count();
           if(aux == a.size())
                arrFactorsIntegerBeing.add(n);
        }
        
        //2nd Process
        List<Integer> arrIntegerBeingFactors = new ArrayList<>();
        
        for(Integer n : arrFactorsIntegerBeing){
           Integer aux = (int) b.stream().filter(i -> i % n == 0).count();
           if(aux == b.size())
                arrIntegerBeingFactors.add(n);
            
        }
        
        
        
        return arrIntegerBeingFactors.size();    
    }
    
    /**
     * Here we are getting the value between the last element of 'a' and the first element of 'b'
   		
     */
    public static List<Integer> getPossibleNumbers(List<Integer> a, List<Integer> b){
        List<Integer> listNum = new ArrayList<>();
 
        Integer currentNumber = a.get(a.size()-1);
        listNum.add(currentNumber);
        while(currentNumber <= b.get(0)){
            currentNumber += 1;
            listNum.add(currentNumber);
        }
        
        return listNum;
        
    }
}
