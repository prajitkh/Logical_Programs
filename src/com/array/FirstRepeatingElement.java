package com.array;

public class FirstRepeatingElement {

	public static int repeat(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { 10, 5, 3, 4, 3, 5, 6 };
		int repeat = repeat(arr);
		System.out.println(arr[repeat]);
	}
}
