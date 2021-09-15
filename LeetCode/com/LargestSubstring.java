package com;

import java.util.Iterator;

public class LargestSubstring {

	public static String findLargestSubstring(String[] arr, int n) {
		for (int i = 0; i < n; i++) {
			String result = arr[0];
			return findGCD(result, arr[1 + i]);
		}
		return null;
	}

	private static String findGCD(String str1, String str2) {
		// TODO Auto-generated method stub
		if (str1.length() == str2.length()) {
			if (str1.equalsIgnoreCase(str2)) {
				return str1;
			} else {
				return "Strings are different";
			}
		}
		if (str1.length() < str2.length()) {
			return findGCD(str2, str1);
		} else if (!str1.startsWith(str2)) {
			return "Strings are different";
		} else if (str2.isEmpty()) {
			return str1;
		} else if (str1.length() == str2.length()) {
			if (str1.equalsIgnoreCase(str2)) {
				return str1;
			} else {
				return "Strings are different";
			}
		} else {
			return findGCD(str1.substring(0, str2.length()), str2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "love", "hater", "lovely" };
		int n = arr.length;
		System.out.println(findLargestSubstring(arr, n));
	}

}
