package com.array;

public class FibonacciSerires {

	public static void FibonacciRescurssion() {
		int num1 = 0;
		int num2 = 1;
		for (int i = 1; i < 10; i++) {
			int num3 = num1 + num2;
			System.out.println(num3);

			num1 = num2;
			num2 = num3;
		}
	}

	static int num1 = 0;
	static int num2 = 1;

	public static void FibonacciwithRescurssion(int n) {

		if (n > 0) {

			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.println(num3);

			FibonacciwithRescurssion(n - 1);
		}

	}

	public static void main(String[] args) {
		FibonacciwithRescurssion(10);
	}

}
