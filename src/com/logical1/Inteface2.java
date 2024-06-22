package com.logical1;

public class Inteface2 implements Interface1 {

	@Override
	public int add() {
		System.out.println("serviceimpl");
		return 0;
	}

	static void check1() {
		System.out.println("static 2");
	}

	public static void main(String[] args) {
		Inteface2 inteface2 = new Inteface2();
		inteface2.checID();
		inteface2.check1();
	}

}
