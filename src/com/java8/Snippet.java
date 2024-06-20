package com.java8;

import java.util.Optional;

public class Snippet {

	public static void main(String[] args) {

		Optional<String> optional = Optional.ofNullable(null);

		if (optional.isPresent()) {
			System.out.println("empty");
		} else {
			System.out.println("null");

		}
		optional.ifPresent(System.out::println);
	}

}