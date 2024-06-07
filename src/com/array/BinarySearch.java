package com.array;

public class BinarySearch {

	public static void binarySearch(int arr[]) {

		int low = 0;
		int high = arr.length - 1;
		int target = 67;
		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (arr[mid] == target) {
				System.out.println("presnet at index " + mid);
			}
			if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;

			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 6, 7, 8, 9, 23, 45, 67 };

		binarySearch(arr);
	}

}
