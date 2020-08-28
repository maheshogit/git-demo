package com.inet.thread;

public class ThreadSleepDemo {

	public static void main(String[] args) throws InterruptedException {
  for(int i=1;i<=10;i++){
	  System.out.println("slide one:"+i);
	  Thread.sleep(1000);
  }
	}

}
