package com.inet.poly;

class A {
	public void m1() {
		System.out.println("class  A m1()");
	}

	public void m2() {
		System.out.println("class A m2()");
	}

	public void m3() {
		System.out.println("class A m3()");
	}

	public void display(int a) {
		System.out.println("this is A class display(int a)");
	}

	public void m1(int a) {
		System.out.println("class A class 2nd m1(int a)");
	}
}

class B extends A {
	public void m1() {
		System.out.println("class  B m1()");
	}

	public void m4() {
		System.out.println("class B m4()");
	}

	public void m5() {
		System.out.println("class B m5()");
	}

	public void display(int a) {
		System.out.println("this is B class display(int a)");
	}

	public void m1(int a, int b) {
		System.out.println("class B class 2nd m1(int a)");
	}

	public static void main(String[] args) {
		A a = new A();
		a.m1();
		a.m2();
		a.m3();
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		b.m5();
		b.m1(13);
		A a2 = new B();
		a2.m1();
		a2.m2();
		a2.m3();
		a2.display(10);
		// a2.m5(); ce:
		// a2.m4();ce:

	}
}
