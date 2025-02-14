package com.ar.array_and_queries;

import java.util.*;


public class Main {
	  public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scanner =  new Scanner(System.in);
	        
	        int n = scanner.nextInt();
	        int m =  scanner.nextInt();
	        
	        List<Integer> arr = fillTheArray(n, scanner);
	        List<List<Integer>> queries = fillQueries(m, scanner);
	        
	        
	        for(List<Integer> query : queries){
	            int typeOperation  = query.get(0);
	            int start  = query.get(1);
	            int end = query.get(2);
	   
	            /*
	            arr.forEach(num->{
	                System.out.print(num+" ");
	            });
	            System.out.println();
	              */  
	            
	            List<Integer> subArray = new ArrayList<>(arr.subList(start-1, end));
	            
	            arr.removeAll(subArray);
	            
	            if(typeOperation == 1)
	                arr.addAll(0,subArray);
	            else
	                arr.addAll(arr.size(),subArray);
	            
	        }
	        int numberAbs = Math.abs(arr.get(0) - arr.get(arr.size()-1));
	        System.out.println(numberAbs);
	        arr.forEach(num->{
	            System.out.print(num+" ");
	        });
	    }
	    
	    public static List<Integer> fillTheArray(int n, Scanner scanner){
	        List<Integer> arr = new ArrayList<>();
	        for(int i = 0 ; i < n ; i++)
	            arr.add(scanner.nextInt());
	        
	        
	        return arr;
	    }
	    
	    public static List<List<Integer>> fillQueries(int m, Scanner scanner){
	        final int COUNT_DATA = 3;
	        List<List<Integer>> queries = new ArrayList<List<Integer>>();
	        
	        for(int i = 0 ; i < m ; i++){
	            queries.add(new ArrayList<Integer>());
	            for(int j = 0 ; j < COUNT_DATA; j++)
	                queries.get(i).add(scanner.nextInt());   
	        }
	        return queries;       
	    }
	    
}
