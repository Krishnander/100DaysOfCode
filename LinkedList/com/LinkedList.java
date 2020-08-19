package com;

public class LinkedList<E> {
	Node headNode;
	Node lastNode;
	int currentSize;
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	public LinkedList() {
		headNode=null;
		currentSize=0;
	}
	public void addFirst(int new_data){
		Node new_Node=new Node(new_data);
		if (headNode==null) {
			headNode=new_Node;
			return;
		}
		new_Node.next=headNode;
		headNode=new_Node;
		currentSize++;
	}
	
	public void addLast(int new_data) {
		Node new_Node=new Node(new_data);
		if (headNode==null) {
			headNode=lastNode=new_Node;
			return;
		}
		while (headNode.next!=null) {
			headNode.next=new_Node;
		}
		lastNode.next=new_Node;
		lastNode=new_Node;
		return;
	}
	
	public void removeFirst() {
		if (headNode==null) {
			System.out.println("List is empty");
		}
		int temp=headNode.data;
		if (headNode==lastNode) {
			headNode=lastNode=null;
		}
		else {
			headNode=headNode.next;
		}
		currentSize--;
		System.out.println("The number removed is "+temp);
		
	}
	
	public void removeLast() {
		if (headNode==null) {
			System.out.println("List is empty");
		}
		if (headNode==lastNode) {
			removeFirst();
		}
		else {
			Node tempNode=headNode;
			while (tempNode.next!=null) {
				tempNode.next=tempNode;
			}
			lastNode=tempNode;
			lastNode.next=null;
		}
	}
	
	/*
	 * public E removeAtGivenPosition(E obj) { Node currNode=headNode; Node
	 * preNode=null; while (currNode!=null) { E o=E(currNode.data); if
	 * (((Comparable<E>)obj).compareTo(o)) {
	 * 
	 * } } }
	 */
	
}