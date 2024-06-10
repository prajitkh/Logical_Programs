package com.array;

public class FindMissingNumber {
	public static void main(String[] args) {

		int arr[] = { 5, 6, 8, 9, 1, 2, 3, 4 };

		int tem[] = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			tem[arr[i] - 1] = 1;
		}
		int temp = 0;
		for (int i = 0; i < tem.length; i++) {
			if (tem[i] == 0) {
				temp = i + 1;
			}

		}
		System.out.println(temp);

	}

}
