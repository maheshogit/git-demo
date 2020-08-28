package com.inet.thread;

class ThreadA extends Thread {
	int total = 0;

	public void run() {
		for (int i = 1; i < 100; i++) {
			total = total + i;
		}
		this.notify();
	}

}

public class InterThreadCommunicationDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadA t = new ThreadA();
		t.start();
		// Thread.sleep(1000); //sleep() is not good pgrm bez excepting some
		// updaton in child thread calling sleep() not good
		// t.join();//excepting some updaton in child thread calling join() not
		// good.bez main thread performance is going to be low
		
		t.wait();
		System.out.println(t.total);
	}

}
