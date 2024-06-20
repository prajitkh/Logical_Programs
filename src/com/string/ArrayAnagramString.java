package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayAnagramString {

	public static void main(String[] args) {

		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> groupAnagrams = groupAnagrams(str);

		System.out.println(groupAnagrams);


		() -> System.out.println("Zero parameter lambda");
	}

	private static List<List<String>> groupAnagrams(String[] str) {

		Map<String, List<String>> map = new HashMap<>();
		for (String s : str) {

			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);
			String valueOf = String.valueOf(charArray);
			if (!map.containsKey(valueOf)) {
				map.put(valueOf, new ArrayList<String>());
			}

			map.get(valueOf).add(s);

		}
		return new ArrayList<>(map.values());
	}
}