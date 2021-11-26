package com;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var obj = new GCD();
		System.out.println(obj.calculate(48,16));
	}
	
	public int calculate(int a, int b) {
		if(a<0 || b<0)
			return -1;
		if(b==0)
			return a;
		return calculate(b, a%b);
	}

}
