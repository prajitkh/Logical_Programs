package com.java8;

import java.util.ArrayList;
import java.util.List;

public class CommanElement {

	public static void commanListOfElement(int ar1[], int ar2[], int ar3[]) {
		List<Integer> in = new ArrayList<>();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar2.length; j++) {
				if (ar1[i] == ar2[j]) {
					in.add(ar1[i]);

				}
			}

		}

		for (int i = 0; i < ar3.length; i++) {
			if (in.contains(ar3[i])) {
				list.add(ar3[i]);

			}
		}
		System.out.println("comman list " + list);

	}

	public static void main(String[] args) {

		int ar1[] = { 1, 5, 10, 20, 40, 80 };
		int ar2[] = { 6, 7, 20, 80, 100 };
		int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
		commanListOfElement(ar1, ar2, ar3);
	}

}