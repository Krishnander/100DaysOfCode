package com;

import java.util.Scanner;

// QUESTION : Find Missing Number from 1 to n range in Unsorted array

public class MissingNumber {
	
	public void missingNumber(int b[]) {
		int n=(b.length)+1;
		int s=(n*(n+1))/2;
		for (int i = 0; i < b.length; i++) {
			s=s-b[i];
		}
		
		System.out.println("The missing number is "+s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many array elements do you wish to enter?");
		int l = sc.nextInt();
		int a[] = new int[l];
		System.out.println("Enter array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		MissingNumber obj=new MissingNumber();
		obj.missingNumber(a);
	}

}
