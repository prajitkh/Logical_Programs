package com.multithreading;

import java.util.LinkedHashSet;
import java.util.Set;

public class SampleThread implements Runnable {

	public final void get(int a, String s) {

	}

	public final void get(double a, String s) {

	}

	public static int data() {

		try {
			throw new RuntimeException("WX");
		} catch (Exception e) {
			return 10;
		} finally {
			return 100;

		}
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("MAIN " + Thread.currentThread().getId());

	}

	public static void main(String[] args) throws InterruptedException {

		Set<String> set = new LinkedHashSet<>();
		set.add(null);
		set.add("df");
		set.add(null);
		System.out.println(set);

		System.out.println(data());
		SampleThread sampleThread = new SampleThread();

		Thread thred1 = new Thread(sampleThread);
		thred1.start();

		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			Thread thred = new Thread(sampleThread);
			thred.start();
		}

	}
}
