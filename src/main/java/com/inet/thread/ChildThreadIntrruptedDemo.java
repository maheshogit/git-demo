package com.inet.thread;

class ThreadDemo1 extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("child thread sleeping");
				Thread.sleep(2000);
			}
		} catch (InterruptedException ie) {
			System.out.println("i got Interrupted");
		}
	}
}

public class ChildThreadIntrruptedDemo {
	public static void main(String[] args) {
		ThreadDemo1 td=new ThreadDemo1();
		td.start();
		td.interrupt();
		System.out.println("End of main thread");

	}

}
