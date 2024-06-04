package com.logical1;

public class DameonThread extends Thread {

	@Override
	public void run() {

		if (Thread.currentThread().isDaemon()) {
			System.out.println("isDaemon thread method ");
		} else {
			System.out.println("Not  thread method ");
		}

	}

	public static void main(String[] args) {
		System.out.println("main method class");
		DameonThread dameonThreanew = new DameonThread();
		dameonThreanew.setDaemon(true);
		dameonThreanew.start();
	}

}
