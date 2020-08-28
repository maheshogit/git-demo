package com.inet.thread;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("child thread");
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.setName("siva child");
		t.setPriority(7);
		System.out.println("child thread name:"+t.getName());
		System.out.println("child thread getPriority:"+t.getPriority());
		t.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("main thread");

		}
		System.out.println("main thread name:"+Thread.currentThread().getName());
		Thread.currentThread().setName("siva");
		System.out.println(Thread.currentThread().getName());
		System.out.println("MAIN THREAD getPriority:"+Thread.currentThread().getPriority());

	}

}
