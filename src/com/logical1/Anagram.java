package com.logical1;

import java.util.Arrays;

public class Anagram {
	public static boolean getdataa(String s1, String s2) {
		char[] charArray = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();

		Arrays.sort(charArray);
		Arrays.sort(charArray2);
//		for (int i = 0; i < charArray2.length; i++) {
//			if (charArray[i] != charArray2[i]) {
//				return false;
//			}
//
//		}

		if (!Arrays.equals(charArray, charArray2)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		String s1 = "silent";

		String s2 = "listen";
		System.out.println(getdataa(s1, s2));
	}

}