package com.string;

public class TestMain implements Test, Test1 {

	@Override
	public void data() {
		System.out.println("main class");

	}

	public static void main(String[] args) {
		Test1 main = new TestMain();
		main.data();
	}

}
