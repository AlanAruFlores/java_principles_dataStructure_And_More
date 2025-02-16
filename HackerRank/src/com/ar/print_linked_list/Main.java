package com.ar.print_linked_list;

public class Main {
	 // Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

	class SinglyLinkedListNode{
	    int data;
	    SinglyLinkedListNode next;     
	}
	
	static void printLinkedList(SinglyLinkedListNode head) {   
        while(head != null){
            int data = head.data;
            System.out.println(data);
            head = head.next;
        }
            
    }

}
