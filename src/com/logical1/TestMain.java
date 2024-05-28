package com.logical1;

public class TestMain {
	public static void main(String[] args) {

		Test<Integer> test = new Test<Integer>(14);
		System.out.println(test.getObject());

		Test<String> test2 = new Test<String>("TEST generic Type");
		System.out.println(test2.getObject());
	}

}
