package com.logical;

import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class ArrayList {
	public static void main(String[] args) {

		List<String> list = new java.util.ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		Iterator<String> iterator = list.iterator();
		iterator.hasNext();
		// iterator.remove();
		System.out.println(iterator);

		Function<String, char[]> function = e -> e.toCharArray();
		function.apply("testo");

		Function<Integer, Integer> function2 = e -> e * 2;
		Function<Integer, Integer> function3 = e -> e * e * e;

		System.out.println(function2.andThen(function3).apply(3));
	}

}
