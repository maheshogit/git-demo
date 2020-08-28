package com.inet.thread;

class MyThread1 extends Thread {
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Child class MyThread");
			Thread.yield();
		}
	}
}

public class TreadYieldDemo {
	public static void main(String[] args) {
		MyThread1 myThread = new MyThread1();
		myThread.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("main class thread");
		}
	}

}
