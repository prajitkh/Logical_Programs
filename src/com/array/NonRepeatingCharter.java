package com.array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingCharter {

	public static String findFrist(String inputLine) {
		Map<Character, Integer> charCount = new LinkedHashMap<>();

		// Loop through the string and populate the map
		for (char c : inputLine.toCharArray()) {
			if (c != ' ') { // Skip spaces
				charCount.put(c, charCount.getOrDefault(c, 0) + 1);
			}
		}

		// Find the first non-repeating character
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() == 1) {

				return entry.getKey().toString();
			}

		}
		return "/0";
	}

	public static void main(String[] args) {
		// Arguments will be read by STDIN
		Scanner s = new Scanner(System.in); // do not change this
		String inputLine = s.nextLine(); // do not change this
		String findFrist = findFrist(inputLine);
		System.out.println(findFrist);
	}
}