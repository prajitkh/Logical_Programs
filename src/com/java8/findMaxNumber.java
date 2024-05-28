package com.java8;

import java.util.Arrays;
import java.util.List;

public class findMaxNumber {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 5, 3, 7, 2, 9, 4, 6);

		int max = numbers.stream().mapToInt(Integer::intValue).max().orElse(0);

		System.out.println("Maximum number: " + max);
	}

}