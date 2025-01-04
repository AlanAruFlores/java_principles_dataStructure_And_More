package com.ar.cut_sticks;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
	
	/*
	  You are given a number of sticks of varying lengths. 
	  You will iteratively cut the sticks into smaller sticks, 
	  discarding the shortest pieces until there are none left.
	  At each iteration you will determine the length of the shortest stick remaining, 
	  cut that length from each of the longer sticks and then discard all the pieces of that
	  shortest length. When all the remaining sticks are the same length, 
	  they cannot be shortened so discard them.

	  Given the lengths of
	  sticks, print the number of sticks that are left before each iteration until 
	  there are none left.
	  
	 * */

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        
        boolean isEmpty = false;
        List<Integer> results = new ArrayList<>();
        
        
        //Search the min number of the array and then we need to make minus operator in the all elements of the array
        while(!isEmpty){
        	int minNumber = arr.stream().min(Integer::compare).get();
        	results.add(arr.size());
        	arr = arr.stream().map(x -> (x-minNumber)).filter(x -> x > 0).collect(Collectors.toList());
        	isEmpty = arr.size() == 0 ? true : false;
        }
        
        return results;
    }

	public static void main(String [] args) {
		List<Integer> numbers = List.of(5,4,4,2,2,8);
		
		List<Integer> results = cutTheSticks(numbers);
		results.forEach(System.out::println);
	}
}
