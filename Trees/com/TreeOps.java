package com;import javax.swing.RootPaneContainer;

public class TreeOps {
	
	class Node{
		int data;
		Node root;
		Node left;
		Node right;
	}
	
	Node(int a){
		data=a;
		left=right=root=null;
	}
	
	public void add(int i,Node n) {
		if (i>n.data) {
			if (n.right==null) {
				n.right=new Node();
			}
			return add(i, n.right);
		}
		else (i<n.data) {
			if (n.left==null) {
				n.left=new Node();
			}
			return add(i, n.left);
		}
		
	}
	
	public void add(int r) {
		if (root==null) {
			root=new Node();
		}
		add(r, root);
	}

}
