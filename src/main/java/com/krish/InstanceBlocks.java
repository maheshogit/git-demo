package com.krish;

public class InstanceBlocks {
	int x = 10;
	{
		m1();
		System.out.println("FIIB");
	}

	InstanceBlocks() {
		System.out.println("InstanceBlocks CTR");
	}

	public static void main(String[] args) {
		InstanceBlocks instanceBlocks = new InstanceBlocks();
		// instanceBlocks.m1();
		System.out.println("main()");
	}

	public void m1() {
		System.out.println(y);

	}

	{
		System.out.println("SIIB");
	}
	int y = 20;
}
