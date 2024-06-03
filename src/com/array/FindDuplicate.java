package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {

	// 13. WAP with 2 different logic, to find all duplicate numbers in an array.
	//
	public static void findDuplicate(int arr[]) {

		Set<Integer> arrayList = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arrayList.add(arr[i]);
				}
			}

		}
		System.out.println(arrayList);
	}

	public static void findDuplicateUsingjava8(int arr[]) {

		// Map<Integer, Long> collect = number.stream().collect(Collectors.groupingBy(e
		// -> e, Collectors.counting()));
		// System.out.println(collect);

		List<Entry<Integer, Long>> collect = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).collect(Collectors.toList());

//		List<Entry<Integer, Long>> collect2 = collect.entrySet().stream().filter(e -> e.getValue() > 1)
//				.collect(Collectors.toList());

		Set<Integer> arrayList = new HashSet<>();

		for (Map.Entry<Integer, Long> entry : collect) {
			arrayList.add(entry.getKey());
		}

		System.out.println(arrayList);

	}

	public static void main(String[] args) {

		int arr[] = { 11, 11, 80, 60, 10, 50, 30, 100, 0, 50, 50, 80 };
		findDuplicate(arr);
		findDuplicateUsingjava8(arr);
	}
}