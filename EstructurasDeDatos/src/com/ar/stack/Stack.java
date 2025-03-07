package com.ar.stack;

public class Stack<T> {

	private Node top = null;
	
	/*Internal Class*/
	class Node{
		T data;
		Node next;
	}
	
	
	
	/*Insert a new element to the stack*/
	public void push(T data) {
		/*Change references*/
		Node previous = top;
		top = new Node();
		top.data = data;
		top.next = previous;
	}
	
	/*Delete a element*/
	public T pop() {
		if(top == null) { //if is null the top
			return null;
		}
		Node deleted =  top;
		top = top.next;
		
		return deleted.data;
	}
	
	
	public void showElements() {
		Node auxTop = top;
		
		while(auxTop != null) {
			System.out.print(auxTop.data+"-");
			auxTop = auxTop.next;
		}
		
		System.out.println("");
		
	}
}
