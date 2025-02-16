package com.ar.is_this_binary_search_tree;
import java.util.*;



public class Main {
	
	public class Node{
	    int data;
	    Node left;
	    Node right;
	}
	
	   List<Boolean> results = new ArrayList<>();

	     boolean checkBST(Node root) {
	        if(root == null)
	            return false;

	        checkCurrentNodeWithNext(root, root.left, root.right);
	        return results.size()>0 ? false : true;
	    }

	     void checkCurrentNodeWithNext(Node nodeCurrent, Node nextLeft, Node nextRight){
	         if(nodeCurrent  == null){
	             return ;
	         }
	         
	         if((nextLeft != null) && (nodeCurrent.data < nextLeft.data || nodeCurrent.data == nextLeft.data)){
	             results.add(false);
	             return ;
	         }
	         
	         if((nextRight != null) && (nodeCurrent.data > nextRight.data || nodeCurrent.data == nextRight.data)){
	            results.add(false);
	            return ;
	         }
	         
	         if(nextLeft != null)
	           checkCurrentNodeWithNext(nextLeft,nextLeft.left,
	                           nextLeft.right);
	         if(nextRight != null)
	           checkCurrentNodeWithNext(nextRight,nextRight.left,
	                           nextRight.right);
	    }

}
