package com.inet.thread;

class ThreadB extends Thread {
	int total = 0;

	public void run() {
		synchronized(this){
			System.out.println("child thread start calculation");
		for (int i = 1; i < 100; i++) {
			total = total + i;
		}
		System.out.println("child thread trying to give notification");
		this.notify();
		}	
	}
}

public class InterThreadCommunicationDemo1 {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		// Thread.sleep(1000); //sleep() is not good pgrm bez excepting some
		// updaton in child thread calling sleep() not good
		// t.join();//excepting some updaton in child thread calling join() not
		// good.bez main thread performance is going to be low
		synchronized(b){
			System.out.println("main thread trying to call wait()");
		b.wait();
		System.out.println("main thread got notification");
		System.out.println(b.total);
		}
	}
}
