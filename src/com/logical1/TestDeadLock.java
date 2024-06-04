package com.logical1;

public class TestDeadLock {

	String s1 = "prajit";
	String s2 = "khawshi";
	Thread thread = new Thread() {
		@Override
		public void run() {

			while (true) {
				synchronized (s1) {
					System.out.println(currentThread().getName() + " locked" + s1);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					synchronized (s2) {
						System.out.println(Thread.currentThread().getName() + " sss" + s2);

						System.out.println();
					}

				}
			}

		}
	};

	Thread thread1 = new Thread() {
		@Override
		public void run() {

			while (true) {
				synchronized (s1) {
					System.out.println(thread.currentThread().getName() + s1 + " of thread 2 ");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					synchronized (s2) {
						System.out.println("s2 " + s2);
					}

				}
			}

		}
	};

	public static void main(String[] args) {

		TestDeadLock deadLock = new TestDeadLock();
		deadLock.thread.start();
		deadLock.thread1.start();
	}
}
