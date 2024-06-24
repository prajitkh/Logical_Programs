package com.java8;

import java.util.Arrays;
import java.util.List;

public class SqureRoot {

	public static void main(String[] args) {

//		int[] list = { 1, 4, 3, 5, 3, 9 };

		List<Integer> tr = Arrays.asList(23, 8, 7, 98, 5);

		tr.stream().mapToInt(e -> e * e).forEach(System.out::println);

	}
}