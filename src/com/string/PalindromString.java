package com.string;

public class PalindromString {

	public static boolean isPalindrom(String name) {

		String sss = name;

		String temp = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			temp += name.charAt(i);
		}

		if (temp.toLowerCase().equals(sss.toLowerCase())) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		System.out.println(isPalindrom("KqPK"));
	}
}
