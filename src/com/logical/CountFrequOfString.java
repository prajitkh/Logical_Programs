package com.logical;

public class CountFrequOfString {

//
//	Find frequency of each and every character in a string and arrange in descending order of the count
//	Input: Engineer
//	Output : e3n2g1i1r1
//

	public static void CountFreq(String value) {
		int lock = -1;
		int count = 0;
		String daata = "";
		char var[] = value.toLowerCase().toCharArray();
		int temp[] = new int[var.length];
		for (int i = 0; i < var.length; i++) {

			count = 1;
			for (int j = i + 1; j < var.length; j++) {

				if (var[i] == var[j]) {
					temp[j] = lock;
					count++;
				}
			}
			if (temp[i] > lock) {
				daata += var[i] + "" + count;

			}
		}

		System.out.println(daata);
	}

	public static void main(String[] args) {
		CountFreq("Engineer");

	}
}
