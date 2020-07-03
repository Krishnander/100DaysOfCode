package com;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int n = sc.nextInt();
		sc.close();
		int HappyNumber=0;
		while (n>1) {
			int p=0;
			int r=n%10;
			int q=n/10;
			if (q>=10) {
				p=q%10;
				q=q/10;
			}
			HappyNumber=(p*p)+(q*q)+(r*r);
			n=HappyNumber;
		}
		System.out.println(HappyNumber);
		if (HappyNumber==1) {
			System.out.println("It is a happy number");
		}
		else {
			System.out.println("It is not a happy number");

		}
	}

}
