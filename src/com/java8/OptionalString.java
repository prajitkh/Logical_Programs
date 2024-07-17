package com.java8;

import java.util.Optional;

public class OptionalString {

	public static void main(String[] args) {
		Optional<String> name = getName(0);
		if (name != null) {
			System.out.println(name.get());
		}
		name.ifPresent(System.out::println);

	}

	public static Optional<String> getName(int id) {
		String d = null;
		return Optional.ofNullable(d);
	}

}
