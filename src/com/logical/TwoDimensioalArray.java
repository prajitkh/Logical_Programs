package com.logical;

import java.util.Arrays;

public class TwoDimensioalArray {

	public static void main(String[] args) {

		int[][] x;
		int[][] ss;

		int sa[], a[], b[];
		int aas[][][] = new int[1][1][1];
		System.out.println(Arrays.toString(aas));

		int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

		// printing 2D array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(arr[i][j] + " ");

			System.out.println();
		}
	}

}
