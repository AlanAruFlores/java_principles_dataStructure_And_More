package com.ar.tree;

public class BinaryTree {
	Node root = null;
	
	
	
	//Method for insert a new node
	public Node addNodeRecursive(Node current, int data) {
		if(current == null) { // When we reach to a node NULL, we are gonna to save this
			Node n  = new Node();
			n.data = data;
			return n;
		}
		
		if(current.data > data) {
			current.left=addNodeRecursive(current.left, data);
		}
		else if(current.data < data) {
			current.right=addNodeRecursive(current.right, data);
		}else { // if the value exists
			return current;
		}
		
		return current;
		
	}
	
	public void insertNode(int data) 
	{
		root = addNodeRecursive(root, data);
	}
	
	
	//Method for check if element exists
	
	public boolean checkIfExists(int data) {
		return checkRecursive(root, data);
	}

	private boolean checkRecursive(Node current, int data) {
		if(current == null)
			return false;
		if(current.data  == data)
			return true;
		return (current.data > data) ? checkRecursive(current.left, data) : 
				checkRecursive(current.right, data);
	}
	
	//Method for traverse the tree of the elements in a order
	public void traverseInOrder(Node node) {
		if(node != null) {
			traverseInOrder(node.left);
			System.out.print(node.data+" - ");
			traverseInOrder(node.right);
		}
	}
	
	
	//Method to SHOW THE ALL TREE
	
	public void showTree(Node node , int count) {
		
		if(node == null ) return; 
		
		
		showTree(node.right, count+1);
		for(int i  = 0 ;i < count; i++) {
			System.out.print("    ");
		}
		System.out.println(node.data);
		showTree(node.left, count+1);
		
	}
	
	
}
