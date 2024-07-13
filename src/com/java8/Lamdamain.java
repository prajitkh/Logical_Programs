package com.java8;

public class Lamdamain {

	public static void main(String[] args) {

		int i = 0;
		int j = i;
		j = i + ++j;
		System.out.println(i + " " + j);

		Lamda lamda = (int a, int b) -> a + b;
		int add = lamda.add(10, 20);
		System.out.println(add);
	}

}
