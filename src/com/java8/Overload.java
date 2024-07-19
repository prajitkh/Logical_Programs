package com.java8;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Overload {

//	public void m1() {
//		System.out.println("no arg ");
//	}

	public void m1(int d) {
		System.out.println("int ");
	}

	public void m1(int... is) {
		System.out.println("Number");
	}

	public static void main(String[] args) {
		Overload overload = new Overload();
		overload.m1();
		overload.m1('a');

		SimpleDateFormat dateFormat = new SimpleDateFormat();
		Date date = new Date();

		System.out.println();
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime.plusHours(24));
		LocalDate de = LocalDate.now();
		// ;= dateTime.plusDays(.1);
		System.out.println(de.plusDays(1));

	}

}
