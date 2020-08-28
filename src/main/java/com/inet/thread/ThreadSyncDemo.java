package com.inet.thread;

class Disp {
	public void displayn() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {

			}
		}
	}

	public void displayc() {
		for (int i = 65; i <= 75; i++) {
			System.out.print((char) i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {

			}
		}
	}
}

class MyThread21 extends Thread {
	Disp d;

	MyThread21(Disp d) {
		this.d = d;
	}

	public void run() {
		d.displayn();
	}
}

class MyThread22 extends Thread {
	Disp d;

	MyThread22(Disp d) {
		this.d = d;
	}

	public void run() {
		d.displayc();
	}
}

public class ThreadSyncDemo {

	public static void main(String[] args) {
		Disp d = new Disp();
		MyThread21 myThread1 = new MyThread21(d);
		MyThread22 myThread2 = new MyThread22(d);
		myThread1.start();
		myThread2.start();

	}
}
