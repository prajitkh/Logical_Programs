package com.logical1;

import java.util.ArrayList;
import java.util.Arrays;

public class Jav8 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };

		ArrayList<Integer> arrayList = new ArrayList<>(arr.length);

		int[] arrs = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				arrs[count] = arr[i];

			} else {
				count++;
			}

		}

		System.out.println(count);
		System.out.println(Arrays.toString(arrs));
	}

}