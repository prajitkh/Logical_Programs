package com.string;

public class CountUpperCaseLowrCase {
//	19. count lowercase and uppercase
//	input = "Hello world!"
//	output = uppercase = 1, lowercase = 9

	public static void main(String[] args) {
		String name = "Hello world!";

		int count = 0;
		int lower = 0;
		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
				count++;

			} else if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') {
				lower++;

			}

		}
		System.out.println("Upper case count " + count + "   lower case count " + lower);

	}

}
