package com.inet.thread;
/*
 * waiting of child thread until completeing main thread.
 */
class MyThread2 extends Thread {
	static Thread mt;//mt pointing to mainthread object

	public void run() {
		try {
			mt.join();
		} catch (InterruptedException ie) {

		}
		for (int i = 1; i < 10; i++) {
			System.out.println("MyThread2 class Thread");
		}
	}
}

public class ThreadMainJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread2.mt = Thread.currentThread();
		MyThread2 myThread2 = new MyThread2();
		myThread2.start();
		// myThread2.join();//thi is dead lock switchvation
		for (int i = 1; i <= 10; i++) {
			System.out.println("main thread");
			Thread.sleep(2000);
		}

	}

}
