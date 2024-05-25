package com.string;

import java.util.ArrayList;
import java.util.List;

public class FindCommanElement {
	public static void main(String[] args) {

		String arr[] = { "code", "with", "prajit" };
		String arr1[] = { "code", "with", "test" };
		List<String> value = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr1[j]) {
					value.add(arr[i]);
				}
			}
		}
		System.out.println(value);
	}
}