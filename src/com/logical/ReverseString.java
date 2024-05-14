package com.logical;

public class ReverseString {

	// 4. Find the reverse of the string
	public static void Reverse(String name) {

		String[] arr = name.split("\\s+");
		String empty = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				empty += arr[i].charAt(j);
			}
			empty += " ";
		}
		System.out.println(empty);
	}

	public static void Reverse1(String name) {

		String[] arr = name.split("\\s+");
		String empty = "";
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				empty += arr[i].charAt(j);
			}
			empty += " ";
		}
		System.out.println(empty);
	}

	public static void Reverse2(String name) {

		String empty = "";
		char ch;

		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i);
			empty = ch + empty;
		}
		System.out.println(empty);
	}

	public static void main(String[] args) {
		Reverse("Prajit khawshi"); // output ihswahk tijarP

		Reverse("Nimap infotech"); // output pamiN hcetofni
		Reverse2("CORE");

	}

}
