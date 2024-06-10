package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommanElementThreeArray {

	public static void main(String[] args) {

		int array[] = new int[10];
		int ar1[] = { 1, 5, 10, 20, 40, 80 };
		int ar2[] = { 6, 7, 20, 80, 100 };
		int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };

		List<Integer> integers = new ArrayList<>();
		int temp[] = new int[ar3.length];

		for (int i = 0; i < ar1.length; i++) {

			for (int j = 0; j < ar2.length; j++) {

				if (ar1[i] == ar2[j]) {
					temp[i] = ar1[i];
				}

			}
		}

		System.out.println(Arrays.toString(temp));
		for (int a : temp) {
			for (int i = 0; i < ar1.length; i++) {

				if (a == ar3[i]) {

				}
			}

		}
	}
}
