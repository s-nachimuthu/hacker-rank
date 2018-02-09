package com.snachimuthu.hackerrank.algo;

public class CheckBinarySearchTree {

	    class Node {
	        int data;
	        Node left;
	        Node right;
	     }
	

		
	    boolean checkBST(Node root) {
	      return checkBSUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	    }

	    boolean checkBSUtil(Node root,int min,int max){
	        if(root == null || ( isItBinaryNode(root,min,max) 
               &&  checkBSUtil(root.left,min,root.data)
                &&  checkBSUtil(root.right,root.data,max))) {
	             return true;
	        } 
	        return false;            
	    }
	        
	    

	    boolean isItBinaryNode(Node node,int min,int max) {
	       // System.out.println("node data" + node.data + "min:"+ min + "max"+ max);
	        return (node.left == null || node.data > node.left.data) 
	            && (node.right == null || node.data < node.right.data) 
	            && (node.data > min && node.data <max);
                
	    } 
}
