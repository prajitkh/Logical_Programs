package com.logical1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseString {

	public static void main(String[] args) {

		String name = "prajit khawshi java";

		String[] charArray = name.split(" ");
		System.out.println(charArray.length);
		String empty = "";

		for (int i = charArray.length - 1; i >= 0; i--) {

			empty += charArray[i];
			empty += " ";
		}

		System.out.println(empty);
		int[] nums = { 1, 1, 2 };
		Set<Integer> list = new HashSet<>();
		for (Integer integer : nums) {
			list.add(integer);
		}
		System.out.println(list.size());
		int count = 0;

		for (int i = 0; i < nums.length; i++) {

			if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
				continue;
			} else {
				nums[count] = nums[i];
				count++;
			}

		}
		System.out.println(Arrays.toString(nums));
	}
}
