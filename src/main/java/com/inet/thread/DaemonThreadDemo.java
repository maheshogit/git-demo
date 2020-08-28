package com.inet.thread;

class ThreadDaemon extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("this is child thread");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {

		}
	}
}

public class DaemonThreadDemo {
	public static void main(String[] args) {
		ThreadDaemon t = new ThreadDaemon();
		System.out.println(t.isDaemon());
		//t.setDaemon(true);
		System.out.println(t.isDaemon());
		t.start();
		System.out.println("end of main thread");
		
	}
}
