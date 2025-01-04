package com.ar.java_anagrams;

import java.util.Scanner;

public class Solution {

    static boolean seeIfExistsCharacter(char c, char[] arr){
        
        for(char ch : arr){
            if(c == ch){
                return true;
            }
        }       
        
        return false;
        
    }
    
    static char[] getCharactersNoRepeated(String word){
        char[] characters = word.toCharArray();
        
        char[] charDistinct = new char[24]; 
        int countAux = 0 ;
        
        for(int i = 0 ; i < characters.length; i++){
            if(!seeIfExistsCharacter(characters[i], charDistinct)){
                charDistinct[countAux++] = characters[i];
            }
            
        }
        
        char [] distinctResult = new char[countAux];
        for(int i = 0 ; i < distinctResult.length; i++){
            distinctResult[i] = charDistinct[i];
        }
        return distinctResult;
    }

    static boolean seeIfHaveTheSameCharacters(char[] a, char[]b){
       
        if(a.length != b.length)
            return false;
        
        int count = 0;
        for(char chA : a){
            for(char chB : b){
                if(chA == chB){
                    count++;
                    break;
                }
            }
        }    
        
        return count == a.length && count == b.length;
    }
    
    static int[] getFrequency(char[] distinct, char[] word){
        
        int [] frequency = new int[distinct.length];
        
        int countAux = 0 ;
        int amountAux = 0;
        for(char c : distinct){
            for( char cWord : word){
                if(cWord == c){
                    amountAux++;
                }
            }
            frequency[countAux] = amountAux;
            countAux++;            
            amountAux = 0;
        }
         
        return frequency;
    }
    
    static boolean getSameFrequency(int a[] , int b[], char[] distinctA, char[] distinctB){
        if(a.length != b.length)
            return false;
            
        for(int i = 0 ; i < distinctA.length; i++){
            for(int j =  0; j < distinctB.length; j++){
                if(distinctA[i] == distinctB[j]){
                    if(a[i] != b[j])
                        return false;
                }
                
            }
            
        }
        
        return true;
    }
    
    static boolean isAnagram(String a, String b) {
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // Complete the function
        char[] distinctCharsA = getCharactersNoRepeated(a);
        
        char[] distinctCharsB = getCharactersNoRepeated(b);
        
        //check if i have the same characters
        boolean haveSameCharacters = seeIfHaveTheSameCharacters(distinctCharsA,distinctCharsB);
        
        
        //check if have the same frequency
        int[] frequencyA = 
        getFrequency(distinctCharsA, a.toCharArray());
        
        int[] frequencyB = 
        getFrequency(distinctCharsB, b.toCharArray());
        
        
        return haveSameCharacters && getSameFrequency(frequencyA, frequencyB, distinctCharsA, distinctCharsB);
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
