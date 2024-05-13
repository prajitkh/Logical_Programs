package com.logical;

public class DynamicMethodDispatchMain {
	public static void main(String[] args) {

		DynamicMethodDispatch class1;
		class1 = new DynamicMethodDispatchSubClass();

		class1.move();

		class1 = new DynamicMethodDispatchSubClass1();
		class1.move();

	}
}
