package com.ar.electronic_shop;

import java.util.*;

public class Solution {
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
         
        List<Integer> results  = new ArrayList<>();
        List<Integer> ignores = new ArrayList<>();
        
        boolean flag = false;
        for(int k  : keyboards){ 
                
            ciclo: while(!flag){
                
                if(ignores.size() == drives.length){
                    break ciclo;
                }
                
                int maxDrives = Arrays.stream(drives)
                .filter(a -> !ignores.contains(a))
                .max().getAsInt();
                
                
                
                if(k+maxDrives <= b){
                    results.add(k+maxDrives);
                    flag = true;
                }else{
                    ignores.add(maxDrives);
                }
            }    
            ignores.clear();   
            flag=false;
        }
        
        return (results.size() > 0) ? results.stream().max(Integer::compareTo).get() : -1;
    }

}
