package com.logical1;

public class MultiThreading implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			synchronized (this) {
				System.out.println("Inside synchronized method " + i);
			}

			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("thread " + Thread.currentThread());

		}

	}

	static Runnable runnable = new Runnable() {

		@Override
		public void run() {

			System.out.println("Inside run method ");
		}
	};

	public static void main(String[] args) {
		MultiThreading multiThreading = new MultiThreading();

		Thread thread = new Thread(multiThreading);

		thread.start();

		Thread thread1 = new Thread(runnable);
		thread1.start();

		System.out.println("Inside run 22 " + thread1.getPriority());
	}

}
