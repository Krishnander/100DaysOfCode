package com;

public class SinglyLinkedList<E> {

	private Node head;
	private Node tail;
	private int size;

	class Node {
		E data;
		Node next;

		Node(E d) {
			data = d;
			next = null;
		}
	}

	public SinglyLinkedList() {
		head = tail = null;
		size = 0;
	}

	public void addFirst(E data) {
		var newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
		size++;
	}

	public void addLast(E data) {
		var newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		if (head == tail) {
			head.next = newNode;
			return;
		}
		var currentnode = head;
		while (currentnode.next != null) {
			currentnode = currentnode.next;
		}
		currentnode.next = newNode;
	}

	public void removeFirst() {
		if (head == null) {
			return;
		} else if (head == tail) {
			head = tail = null;
			return;
		} else {
			head = head.next;
			size--;
		}
	}

	public void removeLast() {
		var currentnode = head;
		while (currentnode.next.next != null) {
			currentnode = currentnode.next;
		}
		currentnode.next = null;
	}

	public void removeGivenElement(E data) {
		if (head == null) {
			return;
		}
		var currentnode = head;
		while (currentnode.next != null) {
			if (currentnode.next.data == data) {
				var nextnode = currentnode.next;
				currentnode.next = nextnode.next;
			}
			currentnode = currentnode.next;
			size++;
		}
	}

	public boolean contains(E data) {
		if (head == null) {
			return false;
		}
		var currentnode = head;
		while (currentnode.next != null) {
			if (currentnode.data == data) {
				return true;
			}
			currentnode = currentnode.next;
			size++;
		}
		return false;
	}

	public void display() {
		var currentnode = head;
		while (currentnode != null) {
			System.out.println(currentnode.data);
			currentnode = currentnode.next;
			size++;
		}
	}

	public static void main(String[] args) {
		var testList = new SinglyLinkedList<Integer>();
		int n = 10;
		for (int i = 0; i < n; i++) {
			testList.addLast(i);
		}
		testList.removeFirst();
		testList.removeLast();
		testList.removeGivenElement(5);
		System.out.println(testList.contains(6));
		testList.display();
	}

}
