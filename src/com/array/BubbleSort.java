package com.array;

import java.util.Arrays;

public class BubbleSort {

	public static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}
			}

		}
		System.out.println("selectionSort " + Arrays.toString(arr));
	}

	public static void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}

		}
		System.out.println("bubbleSort " + Arrays.toString(arr));
	}

	public static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && current >= arr[j]) {

				arr[j + 1] = arr[j];
				j--;

			}

			arr[j + 1] = current;

		}
		System.out.println("insertionSort " + Arrays.toString(arr));

	}

	public static void main(String[] args) {

		int arr[] = { 2, 5, 3, 8, 9 };
		insertionSort(arr);
		bubbleSort(arr);
	}

}