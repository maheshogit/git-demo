package com.krish;

class Base1 {
	static int x = 10;//1
	static {//2
		m1();
		System.out.println("BSB");
	}

	public static void main(String[] args) {//3
		m1();
		System.out.println("Base main()");
	}

	public static void m1() {//4
		System.out.println(y);
	}

	static int y = 20;//5
}

class Derived extends Base1 {
	static int i = 30;//6
	static {//7
		m2();
		System.out.println("DFSB");
	}

	public static void main(String[] args) {//8
		m2();
		System.out.println("Derived main()");
	}

	public static void m2() {//9
		System.out.println(j);
	}

	static {//10
		System.out.println("DSSB");
	}
	static int j = 200;//11
}