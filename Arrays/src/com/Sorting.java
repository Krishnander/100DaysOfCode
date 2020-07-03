package com;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

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
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
