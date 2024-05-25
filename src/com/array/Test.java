package com.array;

import java.util.Arrays;

public class Test implements Runnable {
	public static void main(String[] args) {

		int arr[] = { 2, 2, 1, 2, 3, 6, 4, 7, 2, 7, 5 };
		// count frequency of number using java 8
		double orElse = Arrays.stream(arr).mapToDouble(e -> e).average().orElse(0.0);

		System.out.println(orElse);
		Test test = new Test();
		for (int i = 0; i < 10; i++) {
			Thread object = new Thread(test);
			object.start();
		}

	}

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getId() + " is running");
	}

}
