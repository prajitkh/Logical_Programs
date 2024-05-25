package com.array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomStringSort {
	public static void main(String[] args) {
		String input = "aaaaaaabbdddddkkkkxaadd";
		String sortedOutput = customSortString(input);
		System.out.println(sortedOutput); // Output: xaabbddkkkkdddddaaaaaaa
	}

	private static String customSortString(String input) {
		String temp = "";
		Map<String, Integer> map = new HashMap<>();
		String str = "";
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == input.charAt(i + 1)) {
				str = str + String.valueOf(input.charAt(i));
			} else {
				str = str + String.valueOf(input.charAt(i));
				map.put(str, str.length());
				str = "";
			}
		}

		LinkedHashMap<String, Integer> sortedMap = map.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().thenComparing(Map.Entry.comparingByKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
			temp = temp + entry.getKey();
		}

		return temp;
	}

}