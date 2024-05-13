package com.logical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(2, 3, 4, 5, 40, 2, 2, 8);
		// count frequency number using stream java 8

		Map<Integer, Long> collect = number.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(collect);

	}

}
