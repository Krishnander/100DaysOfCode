package com;

import java.util.Scanner;

public class FibonacciSeries {

	/*
	 * public int getFibonacci(int n) { if(n<=1) { return n; } else {
	 * 
	 * return getFibonacci(n-2)+getFibonacci(n-1); } }
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int n = sc.nextInt();
		sc.close();

		int firstTerm = 0, secondTerm = 1;
		int thirdTerm = 0;
		System.out.println(firstTerm);
		System.out.println(secondTerm);
		for (int i = n - 2; i != 0; i--) {
			thirdTerm = secondTerm + firstTerm;
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
			System.out.println(thirdTerm);
		}

		/*
		 * FibonacciSeries fSeries = new FibonacciSeries();
		 * System.out.println(fSeries.getFibonacci(8));
		 */

	}

}
