
package com.logical1;

import java.util.HashMap;
import java.util.Map;

public class CountFreq {

	public static void main(String[] args) {
		int num = 133221656;
		int ss = 0;

		Map<Integer, Integer> map = new HashMap<>();

		while (num > 0) {
			int rem = num % 10;
			if (!map.containsKey(rem)) {
				map.put(rem, 1);
			} else {
				map.put(rem, map.get(rem) + 1);
			}

			// System.out.println(rem);
			num = num / 10;

		}
		System.out.println(map);

	}
}
