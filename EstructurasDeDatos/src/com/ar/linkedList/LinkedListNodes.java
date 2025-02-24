package com.ar.linkedList;

public class LinkedListNodes {
	Node head; //the first element
	Node tail; //the last element
	
	
	//Insert a new element
	public void insert(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			//If we have 1 or more elements , we are gonna to set the reference of the next node
			tail.next = newNode;
			tail = newNode;
		}
		
	}
	
	//Delete a element
	public void delete(int data) {
		
		Node current = head; // We are gonna to search the element since HEAD element
		Node previous = null; // we are gonna to need this if the element to delete is not the HEAD 
	
		while(current != null) {
			
			if(current.data  == data) {
				
				//if the data is the first element, we need to only move the reference to the next element
				if(previous == null) {
					head = current.next;
				}
			
				else {
					previous.next = current.next; // We change the reference to delete the element
				}
				
				
			}
			
			previous = current;			
			current = current.next;
		}
	
	}
	
	
	
	//print the elements of linked list
	public void traverse() {
		Node current = head;
		
		while(current != null) {
			System.out.print(current.data+"-");
			current = current.next;
		}
		System.out.println("");
		
	}
	
	
}
