package com.logical;

public class SwapValues {

	public static void main(String[] args) {
		int a = 10;
		int b = 12;

		a = a + b; // 22
		b = a - b; // 22-12=10
		a = a - b; // 22-10 =12
		System.out.println(" a " + a + "b " + b);

	}

}
