package com.string;

public class PrintPrimeNumbers {

	public static void printPrime(int number) {
		int j;
		for (int i = 0; i < number; i++)

		{
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {

		int number = 100; // print 2 to 100
		printPrime(number);

	}
}
