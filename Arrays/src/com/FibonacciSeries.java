package com;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int n=sc.nextInt();
		sc.close();
		int i;
		for (i = 0; i < n; i++) {
			i+=i;
		}
		System.out.println("The fibonacci series of first "+n+" numbers is "+n);
	}

}
