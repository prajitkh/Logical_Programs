package com.logical1;

public interface Interface1 {

	public int add();

	default void checID() {
		System.out.println("default");
	}

	static void check1() {
		System.out.println("static");
	}
}
