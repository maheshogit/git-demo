package com.inet.thread;
class DaemonDemo extends Thread{
	
}
public class DaemonSample {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().isDaemon());
	//Thread.currentThread().setDaemon(true);
	DaemonDemo daemonDemo1 = new DaemonDemo();
	daemonDemo1.setDaemon(true);
	System.out.println(daemonDemo1.isDaemon());
}
}
