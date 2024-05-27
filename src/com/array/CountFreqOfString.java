package com.array;

import java.util.HashMap;
import java.util.Map;

public class CountFreqOfString {

	public static void main(String[] args) {

		String var = "aaaprajitkhp";
		char c[] = var.toCharArray();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < c.length; i++) {

			if (map.containsKey(String.valueOf(c[i]))) {
				map.put(String.valueOf(c[i]), map.get(String.valueOf(c[i])) + 1);
			} else {
				map.put(String.valueOf(c[i]), 1);
			}

		}

		System.out.println(map);

	}

}
