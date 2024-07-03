package com.logical1;

public class CLASSC implements ClassA, CLASSB {

	@Override
	public void get() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getQ() {
		// TODO Auto-generated method stub

	}

//	@Override
//	public void getDefault() {
//
//		ClassA.super.getDefault();
//	}

	public static void main(String[] args) {

		CLASSC classc = new CLASSC();
		classc.getDefault();

	}

}