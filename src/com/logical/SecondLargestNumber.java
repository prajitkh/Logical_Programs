package com.logical;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestNumber {

	public static void Second(int arr[]) {

		int larget = 0;
		int second = 0;
		for (int i = 0; i < arr.length; i++) {
			if (larget < arr[i]) {
				larget = arr[i];

			}

			if (larget != arr[i] && second <= arr[i]) {
				second = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {

			if (larget != arr[i] && second <= arr[i]) {
				second = arr[i];
			}
		}
		System.out.println(second);
	}

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
		// System.out.println(Arrays.toString(arr));
		Second(arr);

		// Using java 8
		Integer integer = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println(integer);

	}

}
