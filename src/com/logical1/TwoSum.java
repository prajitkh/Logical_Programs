package com.logical1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] arr, int target) {

		int[] ww = new int[2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[] { i, j };
				}

			}
		}
		return null;
	}

	public static int[] twoSumWithMap(int[] arr, int target) {

		int[] ww = new int[2];

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int value = target - arr[i];

			if (map.containsKey(value)) {

				return new int[] { map.get(value), i };

			}

			map.put(arr[i], i);

		}
		return null;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 2, 4 };
		int target = 6;

		System.out.println(Arrays.toString(twoSumWithMap(arr, target)));
		int ss[] = { 1, 2 };
	}

}
