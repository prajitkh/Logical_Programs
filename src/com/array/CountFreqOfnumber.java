package com.array;

import java.util.HashMap;
import java.util.Map;

public class CountFreqOfnumber {

	public static void main(String[] args) {

		int arr[] = { 2, 2, 5, 4, 1, 3, 7, 3, 2, 1, 4 };

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);

	}
}
