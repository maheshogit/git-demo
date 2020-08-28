package com.inet.metro;

 class A  {
public  static void m1(int a){
	System.out.println("this is A class M1();");
}

}
 public class B extends A{
	public  static void m1(int a){
		System.out.println("this is B class M1();");
	}
  public static void main(String[] args) {
	//A a=new A();
	A b =new B();//dynamic polimorphism
	//B b1=new B();
	//a.m1(10);
	b.m1(10);
	//b1.m1(10);
	
}
	
}
