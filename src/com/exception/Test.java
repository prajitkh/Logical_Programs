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

	static int val = 10;

	public static void getdata() {
		val = 20;
		System.out.println(val);
	}

	public static void main(String[] args) {

		int a = 20;

		String data = data();
		System.out.println(data);
		getdata();
		System.out.println(val);

		try {
			int i = 1 / 0;

		} catch (Exception e) {
			e.getMessage();
		} finally {
			System.out.println("tessst");
		}

	}
}
