package com;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		var obj = new DecimalToBinary();
		System.out.println(obj.calculate(16));
	}
	
	public int calculate(int n) {
		if(n<0){
			return -1;
		}
		if(n==0)
		  return 0;
		return n%2 + (10*calculate(n/2));
	}
}
