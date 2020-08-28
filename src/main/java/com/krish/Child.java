package com.krish;

class Parent {
	int x = 10;
	{
		m1();
		System.out.println("PIIB");
	}

	Parent() {
		System.out.println("Parent ctr");
	}

	public static void main(String[] args) {
		Parent parent = new Parent();
		System.out.println("Parent main()");
	}

	public void m1() {
		System.out.println(y);
	}

	int y = 20;
}
public class Child extends Parent {
	int x = 30;
	{
		m2();
		System.out.println("CIIB");
	}

	Child() {
		System.out.println("Child ctr");
	}

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("Child main()");
	}

	public void m2() {
		System.out.println(y);
	}
	{
		System.out.println("CSIIB");
	}
	int y = 40;
}
