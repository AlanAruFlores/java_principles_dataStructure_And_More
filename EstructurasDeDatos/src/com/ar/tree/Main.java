package com.ar.tree;

public class Main {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insertNode(8);
		binaryTree.insertNode(10);
		binaryTree.insertNode(7);
		binaryTree.insertNode(4);
		binaryTree.insertNode(5);
		binaryTree.insertNode(9);
		
		
		//Show the tree
		binaryTree.traverseInOrder(binaryTree.root);
		
		int elementToFind = 10;
		
		boolean exists = binaryTree.checkIfExists(elementToFind);
		System.out.println("");
		if(exists)
			System.out.println("The elemenT exists");
		if(!exists)
			System.out.println("The elemen NOT exists");
		
		
		//Show the tree
		System.out.println("TREE: \n\n\n");
		binaryTree.showTree(binaryTree.root, 0);
	}
}
