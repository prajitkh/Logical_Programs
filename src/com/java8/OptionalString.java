package com.java8;

import java.util.Optional;

public class OptionalString {

	public static void main(String[] args) {
		Optional<String> name = getName(0);
//		if (name != null) {
//			System.out.println(name.get());
//		}

		String orElse = name.isPresent() ? name.get() : "NA";
		// name.ifPresent(System.out::println);
		Integer number = new Integer(5);
		System.out.println(orElse);
	}

	public static Optional<String> getName(int id) {
		String d = null;
		return Optional.ofNullable(d);
	}

}
