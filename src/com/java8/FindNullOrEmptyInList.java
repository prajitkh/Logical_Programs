package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNullOrEmptyInList {

	public static void main(String[] args) {
		String[] temp = { "prajit", "sujit", "", "ram", "roshan", null };
		List<String> collect = Arrays.stream(temp).filter(e -> e == null || e.isEmpty()).collect(Collectors.toList());
		System.out.println(collect);

		List<String> collect2 = Arrays.stream(temp).filter(e -> e != null && !e.isEmpty())
				.map(e -> e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase()).collect(Collectors.toList());
		// System.out.println(collect2);
		collect2.forEach(System.out::println);
		int arr[] = { 3, 1, 3 };

	}

}
