package com.inet.thread;

class A {
	public synchronized void d1(B b) {
		System.out.println("thread 1 starts execution of d1() method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println("thread 1 trying to call B's last()");
		b.last();
	}

	public synchronized void last() {
		System.out.println("inside A,this is last() method");
	}
}

class B {
	public synchronized void d2(A a) {
		System.out.println("thread 2 starts execution of d2() method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println("thread 2 trying to call A's last()");
		a.last();
	}

	public synchronized void last() {
		System.out.println("inside B,this is last() method");
	}
}

public class DeadLock1 extends Thread {
	A a = new A();
	B b = new B();

	public void m1() {
		this.start();
		a.d1(b);// this line execuited by main thread
	}

	public void run() {
		b.d2(a);// this line execuited by child thread
	}

	public static void main(String[] args) {
		DeadLock1 deadLock1 = new DeadLock1();
		deadLock1.m1();
	}

}
