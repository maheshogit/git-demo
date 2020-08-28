package com.inet.sinlgeton;

public class UsedSingleton {
	public void display() {
		System.out.println("UsedSingleton");
	}

	public static void main(String[] args) {
		SingleTon instance = SingleTon.getInstance();
		instance.m1();
		instance.m2();
		System.out.println(instance.hashCode());
		System.out.println("this main()");
		UsedSingleton usedSingleton = new UsedSingleton();
		usedSingleton.display();
	}
}
