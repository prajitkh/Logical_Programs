package com.task.mapProgram;

import java.util.Map;

public class HashMap {

	public static void main(String arr[]) {

		Map<String, Integer> map = new java.util.Hashtable<>();

		map.put("Prajit", 2000);
		map.put("Roshan", 34500);
		map.put("Roshan", 3700);
		map.put("radha", 3700);

		map.put("Roshan", 349500);
		// map.put(null, 349500);

		System.out.println(map.get("Roshan"));
		System.out.println(map);

	}
}
