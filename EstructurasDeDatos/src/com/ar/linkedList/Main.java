package com.ar.linkedList;

public class Main {
	public static void main(String[] args) {
		
		
		LinkedListNodes linkedList  = new LinkedListNodes();
		linkedList.insert(4);
		linkedList.insert(8);
		linkedList.insert(10);
		linkedList.insert(3);
		
		linkedList.traverse();
		
		linkedList.delete(10);
		
		linkedList.traverse();
		
		
	}
}
