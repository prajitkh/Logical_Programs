package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovedDuplicate {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1);
		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);

	}

}
