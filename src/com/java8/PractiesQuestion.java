package com.java8;

public class PractiesQuestion {

	public static void main(String[] args) {

		int arr[] = { 1, 6, 4, 9, 2 };
		int target = 9;
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {

			int middle = left + (right - left) / 2;

			if (arr[middle] == target) {
				System.out.println("index " + middle);
			}

			if (arr[middle] < target) {
				left = middle + 1;

			}

			else {
				right = middle - 1;
			}
		}
	}

}
