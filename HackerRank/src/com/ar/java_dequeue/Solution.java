package com.ar.java_dequeue;
import java.util.*;

public class Solution {

	/*
	 * In this problem, you are given N integers. You need to find the maximum
	 * number of unique integers among all the possible contiguous subarrays
	 * of size M.
	 * 	
	 *INPUT: 5 3 5 2 3
	 * 
	 *	s1=(5,3,5) Has 2 unique numbers 
	 * 	s2=(3,5,2) Has 3 unique numbers
	 *  s3=(5,2,3) Has 3 unique numbers
	 *
	 *OUTPPUT: 3
	 *
	 * */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        
        //amount of elements to make the sub arrays
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            //insert the number into de dequeue
            deque.add(num);          
        }
        
        List<ArrayList<Integer>> subArrays = new ArrayList<ArrayList<Integer>>();

        
        
        while(!deque.isEmpty() && deque.size() >= m) {
        	ArrayList<Integer> subArray = new ArrayList<Integer>();
        	Object[] arrTemp= deque.toArray();
        	
        	for(int i = 0; i<m; i++) {
        		subArray.add((Integer)arrTemp[i]);	
        	}
        	subArrays.add(subArray);	
        	deque.remove(arrTemp[0]);
        }
        
        
        List<Integer> occurences = new ArrayList<Integer>();
        
        subArrays.forEach(arr->{
        	occurences.add((int)arr.stream().distinct().count());
        });
        
        int maxNumber = occurences.stream().max((a,b)->a.compareTo(b)).get();
        
        System.out.println(maxNumber);
        
    }

}

/*Second Example:
 *      
 *      
 *      List<Integer> occurences = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            //insert the number into de dequeue
            deque.add(num);
            
            if(deque.size() == m){
                occurences.add((int)Arrays.stream(deque.toArray()).map(a->(Integer)a).distinct().count());
                deque.removeFirst();
            }    
        }
        
        int maxNumber = occurences.stream().max((a,b)->a.compareTo(b)).get();    
        System.out.println(maxNumber);
          
        
 * 
 * 
 * 
 * */
