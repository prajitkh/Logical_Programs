package com.java8;

import java.util.Arrays;

public class LongestCommanPrefix {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder();
		String empty = "";
		String[] input = { "ab", "a" };

		/// { "geeksforgeeks", "geeks", "geek", "geezer" };

		Arrays.sort(input);
		System.out.println(Arrays.toString(input));

		if (input[0].length() == 0) {

		}

		char[] first = input[0].toCharArray();
		char[] second = input[input.length - 1].toCharArray();

		for (int i = 0; i < input.length; i++) {

			if (first[i] != second[i]) {
				break;
			}
			builder.append(first[i]);
			empty += first[i];
		}

		System.out.println(builder.toString());
		System.out.println(empty);

	}

}
