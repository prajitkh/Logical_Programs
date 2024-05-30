package com.array;

// Find prime numbers from 1 ....n
public class PrimeNumber {

	public static void main(String[] args) {

		int number = 10;
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
}
