package com.inet.thread;
class DisplayDemo1 {
	public void wish(String name) {
        ;;;;;;;;// 1 lack of code
		synchronized (DisplayDemo1.class) {
			for (int i = 0; i < 10; i++) {
				System.out.print("Good Morning:");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				System.out.println(name);
			}	}
		;;;;;;;;;// 1 lack of code
	}
}
class MyThreadDisp1 extends Thread {
	DisplayDemo1 d;
	String name;
	MyThreadDisp1(DisplayDemo1 d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}}
public class SynchronizedClassLevelLockDemo {
	public static void main(String[] args) {
		DisplayDemo1 d = new DisplayDemo1();
		DisplayDemo1 d2 = new DisplayDemo1();
		MyThreadDisp1 myThreadDisp = new MyThreadDisp1(d, "siva");
		MyThreadDisp1 myThreadDisp1 = new MyThreadDisp1(d2, "rama");
		myThreadDisp.start();
		myThreadDisp1.start();
	}}
