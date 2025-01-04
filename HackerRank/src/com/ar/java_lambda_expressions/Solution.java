package com.ar.java_lambda_expressions;
import java.io.*;
import java.util.*;



/*JAVA LAMBDA EXPRESSIONS*/


/*
 * Write the following methods that return a lambda expression performing a specified action:

	PerformOperation isOdd(): The lambda expression must return 
	
	if a number is odd or
	if it is even.
	PerformOperation isPrime(): The lambda expression must return
	if a number is prime or
	if it is composite.
	PerformOperation isPalindrome(): The lambda expression must return
	if a number is a palindrome or if it is not.
 * */



interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
 
 //In this methods we are retrieving the body of the function defined on the interface
 public static PerformOperation isOdd(){
    return (int a) -> {
        return a % 2 != 0 ? true : false;
    };
 }
 
 public static PerformOperation isPrime(){
    return (int a )->{
        for (int i = 1 ; i <= a; i++)
            if((i != 1 && i != a) && a % i == 0)
                return false;
                
        return true;        
    };
 }
 
 public static PerformOperation isPalindrome(){
    
    return (int a) -> {
        StringBuilder builder = new StringBuilder();
        builder.append(a);
        int numReverse = Integer.parseInt(builder.reverse().toString());

        return numReverse == a;
    };
    
 }
 
}
   // Write your code here

public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
