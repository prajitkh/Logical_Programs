package com.logical;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnaragramProgrmString {
	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "oellh";
		Map<Integer, Long> collect = s1.codePoints().boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<Integer, Long> collect1 = s2.codePoints().boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect.equals(collect1));
		System.out.println(collect);
		System.out.println(collect1);
		Map<Integer, Long> collect2 = s2.codePoints().mapToObj(e -> e)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect2.forEach((ch, count) -> System.out.println("Character: " + (char) ch.intValue() + ", Count: " + count));

		System.out.println(collect2);

		System.out.println('A' + 200);

		Map<String, Integer> map = new TreeMap<>();
		map.put("a", 1);
		map.put("c", 2);
		map.put("b", 3);
//		for (Map.Entry<String, Integer> entry : map.entrySet()) {
//
//			System.out.println(entry.getKey());
//		}
		System.out.print(map);

	}

}
