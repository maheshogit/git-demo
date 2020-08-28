package com.inet.thread;

class DisplayDemo {
	public void wish(String name) {
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;// 1 lack of code
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.print("Good Morning:");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				System.out.println(name);
			}

		}

		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;// 1 lack of code
	}
}

class MyThreadDisp extends Thread {
	DisplayDemo d;
	String name;

	MyThreadDisp(DisplayDemo d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class SynchronizedBlockDemo {

	public static void main(String[] args) {
		DisplayDemo d = new DisplayDemo();
		//DisplayDemo d1 = new DisplayDemo();//irregular output bez we r used sync block
		MyThreadDisp myThreadDisp = new MyThreadDisp(d, "siva");
		MyThreadDisp myThreadDisp1 = new MyThreadDisp(d, "rama");
		myThreadDisp.start();
		myThreadDisp1.start();

	}

}
