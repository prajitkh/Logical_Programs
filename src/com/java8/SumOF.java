package com.java8;

import java.util.Arrays;

public class SumOF {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 5, 6, 7, 7, 8, 65, 34, 6, 4, 6, 4 };

		int sum = Arrays.stream(arr).filter(e -> e % 2 == 0).sum();
		System.out.println(sum);

		String arr1[] = { "apple", "banana", "apple", "show", "apple" };
		String temp = "apple";
		long count = Arrays.stream(arr1).filter(e -> e.equals(temp)).count();
		System.out.println("count " + count);

	}

}
