package com.array;

import java.util.Arrays;

public class Kthlargestelement {
	public static void main(String[] args) {
		int k = 4;
		int arr[] = { 7, 10, 4, 3, 20, 15 };

		Arrays.sort(arr);
		System.out.println(arr[k - 1]);
	}
}
