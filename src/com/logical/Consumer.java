package com.logical;

import java.util.function.Function;

public class Consumer {

	public static void main(String args[]) {
		Function<Integer, Double> half = a -> a / 2.0;
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("functional interface");

			}
		}).start();
	}
}
