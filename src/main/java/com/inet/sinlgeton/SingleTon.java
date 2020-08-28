package com.inet.sinlgeton;

public class SingleTon {
	private static SingleTon singl = null;

	private SingleTon() {
		System.out.println("this ctr");
	}

	public static synchronized SingleTon getInstance() {
		if (singl == null) {
			singl = new SingleTon();
		}
		return singl;
	}

	public void m1() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("addition of two no's:"+c);
	}
	public void m2() {
		int a = 10;
		int b = 20;
		int d = a - b;
		System.out.println("sub of two no's:"+d);
	}
  
}
