package com.krish;

public class Base {
	static int x=10;
	//static int y=40;
	static{
		m1();
		System.out.println("fsb");
	}
	public static void main(String[] args) {
		m1();
		System.out.println("this is main()");
	}
	public static void m1() {
		System.out.println(y);
		
	}
	static {
		System.out.println("ssb");
	}
	static int y=20;

}
