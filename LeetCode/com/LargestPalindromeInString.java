package com;

public class LargestPalindromeInString {

	public static String longestPalindrome(String s) {
		int n = s.length();
		char[] S = s.toCharArray();
		boolean[][] B = new boolean[n][n];
		B[n - 1][n - 1] = true;
		for (int i = 0; i < n - 1; i++) {
			B[i][i + 1] = S[i] == S[i + 1];
			B[i][i] = true;
		}

		for (int l = 3; l <= n; l++) {
			for (int i = 0; i < n - l + 1; i++) {
				int j = i + l - 1;
				if (S[i] == S[j] && B[i + 1][j - 1])
					B[i][j] = true;
				else
					B[i][j] = false;
			}
		}
		int maxI = 0, maxJ = 0, max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j - i + 1 > max && B[i][j]) {
					max = j - i + 1;
					maxI = i;
					maxJ = j;
				}
			}
		}
		char[] R = new char[maxJ - maxI + 1];
		for (int i = 0; i < R.length && maxI <= maxJ; i++) {
			R[i] = S[maxI];
			maxI++;
		}
		return String.valueOf(R);
	}

	public static void main(String[] args) {
		String x = "abcbghgbdef";
		System.out.println(longestPalindrome(x));
	}
}
