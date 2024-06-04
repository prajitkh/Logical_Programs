package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAnagramString {

	public static void main(String[] args) {

		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };

		String temp = "abc";
		String temp2 = "cba";
		Arrays.sort(temp.toCharArray());
		// System.out.println(temp);

		Arrays.sort(temp2.toCharArray());
		// System.out.println(temp2);

		Arrays.sort(str);
		int arr2[] = new int[str.length];

		for (int i = 0; i < str.length; i++) {
			List<String> test = new ArrayList<>();
			Arrays.sort(str[i].toCharArray());
			// System.out.println(str[i]);
			for (int j = i + 1; j < str.length; j++) {
				Arrays.sort(str[j].toCharArray());

				// System.out.println(str[j]);
				if (str[i].toCharArray() == (str[j].toCharArray())) {

					System.out.println(str[i] + " ** " + str[j]);
				}
			}

		}

	}
}