package com.shopping.pattern;

public class Test {

	public static String getOutput() {
		try {
			return "try";
		} finally {
			return "finally";
		}
	}

	public static void main(String[] args) {
		System.out.println(getOutput());
	}
}
