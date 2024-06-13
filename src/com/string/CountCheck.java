package com.string;

public class CountCheck {
//	count lowercase and uppercase
//	input = "Hello world!"
//	output = uppercase = 1, lowercase = 9
//	count lowercase and uppercase
//	input = "Hello world!"
//	output = uppercase = 1, lowercase = 9\

	public static void main(String[] args) {

		String input = "Hello world!a";

		char[] charArray = input.toCharArray();
		int count = 0;
		int countUpper = 0;
		for (char c : charArray) {

			if (c >= 'A' && c <= 'Z') {
				count++;
			}
			if (c >= 'a' && c <= 'z') {
				countUpper++;
			}
		}
		System.out.println(countUpper);

	}

}
