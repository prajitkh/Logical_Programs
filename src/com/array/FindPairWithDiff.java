package com.array;

import java.util.Arrays;

public class FindPairWithDiff {

	public static void pair(int arr[]) {

		Arrays.sort(arr);

		int first = 0;
		int last = arr.length - 1;
		int given = 78;

		if (arr[last] - arr[first] == given) {
			System.out.println("(" + arr[first] + "," + arr[last] + ")");
			return;
		}

		System.out.println("no pair");

	}

	public static void main(String[] args) {

		int arr[] = { 5, 20, 3, 2, 50, 80 };
		pair(arr);
	}

}
