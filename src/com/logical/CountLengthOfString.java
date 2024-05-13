package com.logical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountLengthOfString {

	public static void countLength(String arr[]) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		for (int i = 0; i < arr.length; i++) {

			if (!hashMap.containsKey(arr[i].length())) {
				hashMap.put(arr[i].length(), arr[i]);
			} else {
				hashMap.put(arr[i].length(), hashMap.get(arr[i].length()) + "," + arr[i]);
			}

		}
		System.out.println(hashMap);

	}

	public static void main(String[] args) {

		String test = "prajit bbbbbbb bbbbbba Pune";
		String[] var = test.split(" ");
		countLength(var);
		int firstIndex = 0;
		// int lastindex = test.length - 1;
		String empty = "";
		List<String> maxWords = new ArrayList<>();

//		for (String temp : var) {
//			if (temp.length() > firstIndex) {
//				firstIndex = temp.length();
//				maxWords.clear();
//				maxWords.add(temp);
//			} else if (temp.length() == firstIndex) {
//				maxWords.add(empty);
//			}
//		}

		for (String word : var) {

			if (word.length() > firstIndex) {
				firstIndex = word.length();

				maxWords.clear();
				maxWords.add(word);
			} else if (word.length() == firstIndex) {

				maxWords.add(word);
			}
		}

		System.out.println(maxWords);

	}

}
