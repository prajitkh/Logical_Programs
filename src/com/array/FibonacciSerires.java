package com.array;

public class FibonacciSerires {

	public static void main(String[] args) {
		// FibonacciwithRescurssion(10);
		FibonacciwithOutRescurssion(10);
	}

	public static void FibonacciwithOutRescurssion(int i) {
		int n1 = 0;
		int n2 = 1;
		for (int j = 0; j < i; j++) {

			int n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}

	}

	static int n1 = 0;
	static int n2 = 1;
	static int n3 = 0;

	private static void FibonacciwithRescurssion(int i) {

		if (i > 0) {

			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);

			FibonacciwithRescurssion(i - 1);
		}

	}

}
