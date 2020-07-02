package com;

import java.util.Scanner;

public class InsertElementInArray {
	
	public void insert(int a[],int num,int pos) {
		
		for (int i = 0; i <= a.length; i++) {
			if (i==(pos-1)) {
				a[i]=num;	
			}
		}
		System.out.println("The new array is :");
		for (int i : a) {
			System.out.println(i);
		}
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

		System.out.println("Enter the number you wish to insert");
		int number = sc.nextInt();
		
		System.out.println("Enter the position at which you wish to insert");
		int position = sc.nextInt();
		sc.close();
		
		InsertElementInArray obj=new InsertElementInArray();
		obj.insert(a, number, position);
		
		
	}

}
