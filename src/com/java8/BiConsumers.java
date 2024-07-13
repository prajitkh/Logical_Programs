package com.java8;

public class BiConsumers {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int target = 7;
		int first = 0;
		int last = arr.length - 1;

		while (first <= last) {

			int middle = first + (last - first) / 2;

			if (arr[middle] == target) {
				System.out.println("found " + middle);
			}
			if (target <= arr[middle]) {
				last = middle - 1;
			} else {
				first = middle + 1;
			}
		}
		String s1 = "A";
		String s2 = "a";
		String s3 = "b";

		s1.toLowerCase();
		s3.replace('b', 'a');
		System.out.println(s1);
		int a = 10;
		int b = 20;
		System.out.println(a + b + " " + a + b);

		String str = null;
		System.out.println(str.valueOf(10));

		System.out.print("hi " + (s1.equals(s2)) + "**" + (s2.equals(s3)));

	}
}