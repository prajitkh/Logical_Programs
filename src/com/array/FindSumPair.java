package com.array;

import java.util.HashSet;

public class FindSumPair {
	public static void findPairs(int[] arr, int targetSum) {
		HashSet<Integer> set = new HashSet<>();

		for (int num : arr) {
			int complement = targetSum - num;
			if (set.contains(complement)) {
				System.out.println("Pair: (" + num + ", " + complement + ")");
			}
			set.add(num);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 80, 60, 10, 50, 30, 100, 0, 50, 70, 20 };

		findPairs(arr, 100);

	}
}