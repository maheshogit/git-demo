package com.inet.thread;

class MyThreadDemo5 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("chaild class values:" + i);
		}
		System.out.println("child class sleeping");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException ie) {
			System.out.println("child class is Interrupted");
		}
	}
}

public class ThreadIntrruptedDemoSleep {

	public static void main(String[] args) {
		MyThreadDemo5 myThreadDemo5 = new MyThreadDemo5();
		myThreadDemo5.start();
		myThreadDemo5.interrupt();
		System.out.println("end of main thread");

	}

}
