package com.array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringOf {

	public static String getCustemString(String value) {

		Map<String, Integer> map = new HashMap<>();
		String temp = "";
		String valuedata = "";
		for (int i = 0; i < value.length(); i++) {
			if (i != value.length() - 1 || value.charAt(i) != value.charAt(i + 1)) {
				temp = temp + String.valueOf(value.charAt(i));
			} else {
				temp = temp + String.valueOf(value.charAt(i));
				map.put(temp, temp.length());
				temp = "";
			}

		}

		LinkedHashMap<String, Integer> collect = map.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().thenComparing(Map.Entry.comparingByKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		for (Map.Entry<String, Integer> entry : collect.entrySet()) {
			valuedata = valuedata + entry.getKey();
		}

		return valuedata;

	}

	public static void main(String[] args) {
		String val = "aaaaaaabbdddddkkkkxaadd";

		System.out.println(getCustemString(val));
	}

}
