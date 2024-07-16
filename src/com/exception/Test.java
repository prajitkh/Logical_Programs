package com.exception;

public class Test {

	public static String data() {

		try {
			int a = 10 / 0;
			System.out.println(a);
			System.out.println("run successfully");
			return "String return with try";

		} catch (Exception e) {
			System.out.println("exception statment");
			return "exception";
		} finally {
			System.out.println("finally block executed");
		}

	}

	public static void main(String[] args) {
		String data = data();
		System.out.println(data);
	}

}
