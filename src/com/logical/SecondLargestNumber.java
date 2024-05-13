package com.logical;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestNumber {

	public static void secondLargest(int arr[]) {
		int higestNumber = 0;
		int secondHigehst = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > higestNumber) {
				higestNumber = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondHigehst && arr[i] != higestNumber) {
				secondHigehst = arr[i];
			}
		}
		System.out.println("second higest number " + secondHigehst);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 6, 5, 7, 8, 9, 12 };
		System.out.println(Arrays.toString(arr));

		// Using java 8
		Integer integer = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println(integer);

	}

}
