package com;

public class AVLTree {
	
	Node rootNode;
	int currentSize;
	
	class Node{
		int data;
		Node leftNode;
		Node rightNode;
		Node parentNode;
	}
	
	Node(int d){
		data=d;
		leftNode=rightNode=parentNode=null;
	}
	
	public AVLTree() {
		rootNode=null;
		currentSize=0;
	}
	
	public void add(int a) {
		Node newNode=new Node(a);
		if (rootNode==null) {
			rootNode=newNode;
		}
		add(rootNode, newNode);
	}
	
	public int def() {

}
