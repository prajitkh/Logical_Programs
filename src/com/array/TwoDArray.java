package com.array;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		int row = 4;
		int column = 4;
		int arr[][] = new int[row][column];

		int value = 1;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = value;
				value++;

			}
		}

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
