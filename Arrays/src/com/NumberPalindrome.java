package com;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int num = sc.nextInt();
		sc.close();
		int n=num;
		int rev=0;
		 while(n != 0) {
	            int digit = n % 10;
	            rev = rev * 10 + digit;
	            n /= 10;
	        }
		if (rev==num) {
			System.out.println(num+ " is a palindrome");
		}
		else {
			System.out.println(num+" is not a palindrome");
		}
	}

}
