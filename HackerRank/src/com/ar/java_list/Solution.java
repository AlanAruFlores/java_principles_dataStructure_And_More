package com.ar.java_list;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
    
        Integer count = Integer.parseInt(input.nextLine());
        
        List<String> listNumbers = new ArrayList<>(count);
        
      //  for(int i =0 ; i < count ; i++){
            String numbers = input.nextLine();
            String[] numbersArr = numbers.split(" ");    
            listNumbers.addAll(Arrays.asList(numbersArr));
        
        //}
        
        Integer countQueries = Integer.parseInt(input.nextLine());
         
        for(int i = 0 ; i < countQueries; i++){
            String operation = input.nextLine();
            String numbers2 = input.nextLine();
            List<String> params = Arrays.asList(numbers2.split(" "));
        
            if(operation.equalsIgnoreCase("Insert"))
                listNumbers.add(Integer.parseInt(params.get(0)), params.get(1));
            if(operation.equalsIgnoreCase("Delete"))
                listNumbers.remove(Integer.parseInt(params.get(0)));
        }
        listNumbers.forEach(n -> { System.out.print(n + " "); });
    }
}