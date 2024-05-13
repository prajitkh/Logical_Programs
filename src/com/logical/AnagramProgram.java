package com.logical;

import java.util.Arrays;

public class AnagramProgram {

	public static boolean AnagramPro(String var1, String var2) {

		if (var1 != var2) {
			return false;
		}

		Arrays.sort(var1.toCharArray());
		Arrays.sort(var2.toCharArray());

		if (var1.equals(var2)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(AnagramPro("String", "rr"));
	}

}
