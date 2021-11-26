package com;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var obj = new BinaryToDecimal();
		System.out.println(obj.calculate(10000));
	}

	public int calculate(int n) {
		int count = 0;
		int result = 0;
		while (n > 0) {
			var p = n % 10;
			n = n / 10;
			result += p * calculate(2, count);
			count++;
		}

		return result;
	}

	public int calculate(int base, int pow) {
		if (pow < 0)
			return -1;
		if (pow == 1)
			return base;
		else if (pow == 0) {
			return 1;
		}
		return base * calculate(base, pow - 1);
	}

}
