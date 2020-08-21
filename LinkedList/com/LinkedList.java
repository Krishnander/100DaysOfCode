package com;

public class LinkedList<E> {
	Node headNode;
	Node lastNode;
	int currentSize;

	class Node {
		E data;
		Node next;

		Node(E d) {
			data = d;
			next = null;
		}
	}

	public LinkedList() {
		headNode = null;
		currentSize = 0;
	}

	public void addFirst(E new_data) {
		Node new_Node = new Node(new_data);
		if (headNode == null) {
			headNode = new_Node;
			return;
		}
		new_Node.next = headNode;
		headNode = new_Node;
		currentSize++;
	}

	public void addLast(E new_data) {
		Node new_Node = new Node(new_data);
		if (headNode == null) {
			headNode = lastNode = new_Node;
			return;
		}
		while (headNode.next != null) {
			headNode.next = new_Node;
		}
		lastNode.next = new_Node;
		lastNode = new_Node;
		return;
	}

	public void removeFirst() {
		if (headNode == null) {
			System.out.println("List is empty");
			return;
		}

		Node temp = headNode;
		while (temp.next != null) {
			temp = temp.next;
		}
		lastNode = temp;

		if (headNode == lastNode) {
			headNode = lastNode = null;
		} else {
			headNode = headNode.next;
		}
		currentSize--;
	}

	public void removeLast() {
		if (headNode == null) {
			System.out.println("List is empty");
			return;
		}
		Node temp = headNode;
		while (temp.next != null) {
			temp = temp.next;
		}
		lastNode = temp;
		if (headNode == lastNode) {
			removeFirst();
			return;
		}
		Node currNode = headNode;
		Node preNode = null;
		while (currNode != lastNode) {
			preNode = currNode;
			currNode = currNode.next;
		}
		preNode.next = null;
		lastNode = preNode;
		System.out.println("The number removed is " + currNode.data);

	}

	@SuppressWarnings("unchecked")
	public E removeGivenElement(E obj) {
		Node currNode = headNode;
		Node preNode = null;
		while (currNode != null) {
			if (((Comparable<E>) obj).compareTo(currNode.data) == 0) {
				if (currNode == headNode) {
					removeFirst();
				}
				if (currNode == lastNode) {
					removeLast();
				}
				currentSize--;
				preNode.next = currNode.next;
				return currNode.data;
			}
			preNode = currNode;
			currNode = currNode.next;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public boolean contains(E obj) {
		Node currNode = headNode;
		while (currNode != null) {
			if (((Comparable<E>) obj).compareTo(currNode.data) == 0) {
				System.out.println("List contains " + obj);
				return true;
			}
			currNode = currNode.next;
		}
		System.out.println("Not available");
		return false;
	}

	public void display() { // Node current will point to head
		Node current = headNode;

		if (headNode == null) {
			System.out.println("List is empty");
			return;
		} //
		System.out.println("Nodes of singly linked list: ");
		while (current != null) { // Prints each node by incrementing pointer
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList<Integer> testList = new LinkedList<Integer>();
		int n = 10;
		for (int i = 0; i < n; i++) {
			testList.addFirst(i);
		}
		testList.removeFirst();
		testList.removeLast();
		testList.removeGivenElement(6);
		testList.contains(8);
		testList.display();
	}

}