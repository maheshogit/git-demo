package com.inet.itr;

class A {
	int a = 555;

	public void show() {
		System.out.println("parent");
	}
}

public class B extends A {
	int a = 3333;

	public void show() {
		System.out.println("child");
	}

	public void disp() {
		System.out.println("disp");
	}

	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.a);
		a.show();
		
	}
}
