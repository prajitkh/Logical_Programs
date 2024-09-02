package com.inheritance;

public class B extends Main {

	@Override
	public double area() {
		System.out.println("area method");
		return 0.1;
	}

	@Override
	public void draw() {
		System.out.println("drw method");
	}

	public static void main(String[] args) {
		Main main = new B();
		main.draw();
	}

}
