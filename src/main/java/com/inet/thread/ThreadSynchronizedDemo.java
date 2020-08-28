package com.inet.thread;

class Display {
	public static synchronized void wish(String name) {
		for (int i = 1; i <= 10; i++) {
			System.out.print("good morning:");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {

			}
			System.out.println(name);
		}}}
class MyThread12 extends Thread {
	String name;
	Display d;

	MyThread12(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}}
public class ThreadSynchronizedDemo {

	public static void main(String[] args) {
		Display d = new Display();
		Display d2 = new Display();
		MyThread12 myThread1 = new MyThread12(d, "siva");
		MyThread12 myThread2 = new MyThread12(d2, "rama");
		myThread1.start();
		myThread2.start();
	}}
