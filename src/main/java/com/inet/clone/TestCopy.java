package com.inet.clone;

public class TestCopy implements Cloneable {
int i=10;
int j=20;
public static void main(String[] args) throws CloneNotSupportedException {
	Test test = new Test();
	System.out.println("Test data::"+test.i+" "+test.j);
	//shallow clone
	Test t4=test;
	t4.i=300;
	t4.j=400;
	System.out.println("showllow clone data::"+t4.i+" "+t4.j);
	System.out.println("after shollow clone Test data::"+test.i+" "+test.j);
	//deep clone
	Test test2 = (Test) test.clone();
	test2.i=100;
	test2.j=200;
	
	System.out.println("clone data::"+test2.i+" "+test2.j);
	/*System.out.println(test.hashCode()==test2.hashCode());
	System.out.println(test==test2);*/
	
}
}
