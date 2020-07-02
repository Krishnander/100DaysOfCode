package com;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int num = sc.nextInt();
		sc.close();
		int q=0;
		int n=num;
		int AM=num;
		int temp=0;
		double AmstrongNumber=0;
		while (n>0) {
			q+=1;
			n=n/10;
		}
		while (num>0) {
			int rem=num%10;
			temp=rem;
			AmstrongNumber+=Math.pow(temp, q);
			num=num/10;
		}
		if (AmstrongNumber==AM) {
			System.out.println(AM+" is a Armstrong Number");
		}
		else {
			System.out.println(AM+" is not a Armstrong Number");
		}
		
	}

}
