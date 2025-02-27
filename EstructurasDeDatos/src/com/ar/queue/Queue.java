package com.ar.queue;

public class Queue<T> {

	Node top = null;
	Node back = null;
	
	class Node{
		T data;
		Node next;
	}
	
	//insert DATA
	public void enqueue(T data) {
		
		Node oldBack = back; // we use this auxiliar variable to set the references, if the top IS NOT NULL
		back = new Node();
		back.data = data;
		
		if(top == null) {
			top = back;
		}else {
			oldBack.next = back;
		}
		
	}
	
	//delete DATA
	public T dequeue() {
		if(top==null) return null;
		T dataReturn = top.data;
		if(top == back) {
			back = back.next; // NULL
		}
		top = top.next;
		return dataReturn;
	}
	
	
	public void showElements() {
		Node auxTop = top;
		while(auxTop != null) {
			System.out.print(auxTop.data+"-");
			auxTop = auxTop.next;
		}
		System.out.println();
	}
}
