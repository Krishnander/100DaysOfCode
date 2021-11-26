package com;

public class Recursion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var d = new Recursion();
		d.recursiveMethod(6);

	}

	public void recursiveMethod(int n) {
		if(n<1)
			System.out.println("recursive call");
		else {
			recursiveMethod(n-1);
			System.out.println(n);
		}
	}

}
