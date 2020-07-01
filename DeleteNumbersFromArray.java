package com;

import java.util.Scanner;

public class DeleteNumbersFromArray {

	public static void deleteElement(int a[], int d) {
		
		int k = a.length;
		int i;
		for (i = 0; i < k; i++) {
			if (a[i] == d) {
				break;
			}
		}
		if (i == k) {
			System.out.println("Number not present in array");
		}
		for (int j = i; j < k - 1; j++) {
			a[j] = a[j + 1];
		}
		k--;
		System.out.println("The new array elements are : ");
		for (int y = 0; y < k; y++) {
			System.out.print(a[y] + " ");
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

		System.out.println("Enter the number you wish to remove");
		int deleteNumber = sc.nextInt();
		sc.close();
		deleteElement(a, deleteNumber);

	}

}
