package com.array;

import java.util.Arrays;

public class FindMissingNumber {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9 };

		int temp[] = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			temp[arr[i] - 1] = 1;
		}
		System.out.println(Arrays.toString(temp));
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			if (temp[i] == 0)
				ans = i + 1;
		}
		System.out.println(ans);

	}

}
