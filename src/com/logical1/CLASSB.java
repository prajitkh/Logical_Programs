package com.logical1;

@FunctionalInterface
public interface CLASSB {
	public void get();

	default void getDefault() {

		System.out.println("default b methd");

	}
}
