package com.logical;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(3, 2, 3, 4, 5, 40, 2, 2, 8);
		// count frequency number using stream java 8

		Map<Integer, Long> collect = number.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(collect);

		// find duplicate number using java8
		int count = 1;
		Set<Integer> integers = new HashSet();

		for (int i = 0; i < number.size(); i++) {
			for (int j = i + 1; j < number.size(); j++) {
				if (number.get(i) == number.get(j)) {
					integers.add(number.get(i));
				}
			}

		}

		Set<Integer> collect2 = number.stream().filter(r -> Collections.frequency(number, r) > 1)
				.collect(Collectors.toSet());
		System.out.println(collect2);

	}

}
