package com;

import java.util.Scanner;

public class BinarySearch {
	
	public int binarySearch(int a[],int searchNumber,int start, int end) {
		if (a.length==0 || start>end) {
			return -1;
		}
		int mid=(start+end)/2;
		
		if (searchNumber==a[mid]) {
			return mid;
		}
		
		if (searchNumber<a[mid]) {
			return binarySearch(a,searchNumber,start,mid-1);
		}
		else {
			return binarySearch(a, searchNumber, mid+1, end);
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

		System.out.println("Enter the number you wish to search");
		int searchNumber = sc.nextInt();
		sc.close();
		
		BinarySearch bSearch=new BinarySearch();
		
		int i=bSearch.binarySearch(a, searchNumber, 0, a.length);
		
		if (i==-1) {
			System.out.println("Wrong input");
		}
		else {
			System.out.println("The Number "+searchNumber+"  is present in "+i+" position");
		}

	}

}
