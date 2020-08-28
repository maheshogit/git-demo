package com.inet.thread;

class OurThread extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Child class MyThread");
			System.out.println(Thread.currentThread().getPriority());
			try {
				Thread.sleep(2000);
				
			} catch (InterruptedException ie) {

			}

		}
	}
}

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().setPriority(9);
		OurThread myThread = new OurThread();
		myThread.start();
		//myThread.join();//with out time period
		myThread.join();// with time period
		for (int i = 1; i <= 10; i++) {
			System.out.println("main thread");
		}

	}

}
