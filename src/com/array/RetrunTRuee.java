package com.array;

import java.util.Scanner;

public class RetrunTRuee {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inputLine = s.nextLine();

		boolean containsAllLetters = containsAllAlphabet(inputLine);

		System.out.print(containsAllLetters ? "true" : "false");
	}

	public static boolean containsAllAlphabet(String str) {

		boolean[] alphabetPresent = new boolean[26];

		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {

				alphabetPresent[ch - 'a'] = true;
			}
		}

		for (boolean letterPresent : alphabetPresent) {
			if (!letterPresent) {
				return false;
			}
		}

		return true;
	}
}
