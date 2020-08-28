package com.inet.statics;

public class StaticClass {
	int x = 10;
	static int y = 20;

	public static void main(String[] args) {
		StaticClass s1 = new StaticClass();
		System.out.println(s1.x + "=======" + s1.y);
		s1.x = 888;
		s1.y = 999;
		StaticClass s2 = new StaticClass();
		System.out.println(s2.x + "=======" + s2.y);
		System.out.println(s1.x + "=======" + s1.y);
	}

}
