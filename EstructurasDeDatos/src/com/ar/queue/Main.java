package com.ar.queue;

public class Main {
	public static void main(String[]args) {
		Queue<Integer> queue = new Queue<Integer>();
		
		queue.enqueue(4);
		queue.enqueue(2);
		queue.enqueue(10);
		queue.enqueue(60);
		
		queue.showElements();
		
		queue.dequeue();
		queue.showElements();
		
		
	}
}
