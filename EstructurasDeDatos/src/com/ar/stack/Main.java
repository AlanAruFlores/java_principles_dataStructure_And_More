package com.ar.stack;

public class Main {
	
	public static void main(String[] args) {
		
		Stack<Integer> stackCustomized = new Stack<Integer>();
		
		stackCustomized.push(4);
		stackCustomized.push(5);
		stackCustomized.push(8);
		stackCustomized.push(10);
		
		stackCustomized.showElements();
		
		stackCustomized.pop();
		stackCustomized.showElements();
		
		
	}
}
