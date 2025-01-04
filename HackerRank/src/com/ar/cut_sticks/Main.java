package com.ar.cut_sticks;


import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static List<Integer> cutTheSticks(List<Integer> arr) {
        
        boolean isEmpty = false;
        List<Integer> results = new ArrayList<>();
        
        
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
