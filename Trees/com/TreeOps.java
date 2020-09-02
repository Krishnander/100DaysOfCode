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
	
	//Pass the node where addition of new element has to be done
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
	
	//Pass the Grandparent Node where rotation has to be done
	public Node leftRotate(Node node) {
		Node temp=node.right;
		node.right=temp.left;
		temp.left=node;
		return temp;
	}
	
	//Pass the Grandparent Node where rotation has to be done
	public Node rightRotate(Node node) {
		Node temp=node.left;
		node.left=temp.right;
		temp.right=node;
		return temp;
	}
	
	//Pass the Grandparent Node where rotation has to be done
	public Node rightleftRotate(Node node) {
		node.right=rightRotate(node.right);
		return leftRotate(node);
	}
	
	//Pass the Grandparent Node where rotation has to be done
	public Node leftrightRotate(Node node) {
		node.left=leftRotate(node.left);
		return rightRotate(node);
	}
	
	}

}
