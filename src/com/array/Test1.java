package com.array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1 {

//		Example 1:
//			Given text: "aaaaaaabbdddddkkkkxaadd"
//			Expected sorted result/output: "xaabbddkkkkdddddaaaaaaa"
//
//				Explanation:
//					aaaaaaa - First group of "a" has length of seven
//					bb -  "b" has length of two
//					ddddd -  First group of "d" has length of  five
//					kkkk - "k" has length of four
//					x - "x" has length of one
//					aa - Second group of  "a" has length of  two
//					dd - Second group of  "d" has length of  two
//
//					Example 2:
//					Given text: zzzzzrrrrgwwwwwnnzzw
//					Sorted results: gwnnzzrrrrzzzzzwwwww

	public static String getCustomString(String input) {

		Map<String, Integer> inputMap = new LinkedHashMap<>();

		String tempVar = "";
		String saveValue = "";
//		for (int i = 0; i < input.length() - 1; i++) {
//
//			if (input.charAt(i) == input.charAt(i + 1)) {
//
//				tempVar = tempVar + String.valueOf(input.charAt(i));
//			} else {
//				tempVar = tempVar + String.valueOf(input.charAt(i));
//				inputMap.put(tempVar, tempVar.length());
//				tempVar = "";
//			}
//
//		}

		for (int i = 0; i < input.length(); i++) {
			if (i == input.length() - 1 || input.charAt(i) != input.charAt(i + 1)) {
				tempVar = tempVar + String.valueOf(input.charAt(i));
				inputMap.put(tempVar, tempVar.length());
				tempVar = "";
			} else {
				tempVar = tempVar + String.valueOf(input.charAt(i));

			}
		}

		LinkedHashMap<String, Integer> collect = inputMap.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue()
						.thenComparing(Map.Entry.<String, Integer>comparingByKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		for (Map.Entry<String, Integer> entryMap : collect.entrySet()) {
			saveValue = saveValue + entryMap.getKey();
		}
		System.out.println(collect);

		return saveValue;

	}

	public static void main(String[] args) {

		String input = "aaaaaaabbdddddkkkkxaadd";
		String input2 = "zzzzzrrrrgwwwwwnnzzw";

		// Sorted results: gwnnzzrrrrzzzzzwwwww
		// "xaabbddkkkkdddddaaaaaaa"

//			xaabbkkkkdddddaaaaaaa
//			gnnzzrrrrwwwwwzzzzz
		System.out.println(getCustomString(input));
		System.out.println(getCustomString(input2));
	}

}
