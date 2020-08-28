package com.inet.statics;

class OverRid {
	public Object m1() {
		System.out.println("this is parent class m1()");
		return "siva";
	}

}

class OverRiding1 extends OverRid {
	public String m1() {
		System.out.println("this is subclass m1()");
		return "rama";
	}
	public void m2(){
		System.out.println("this is m2()");
	}

}

public class OverRiding {
	public static void main(String[] args) {
		OverRid overRid = new OverRid();
		overRid.m1();
		OverRiding1 overRiding1 = new OverRiding1();
		overRiding1.m1();
		overRiding1.m2();
		OverRid o = new OverRiding1();
		o.m1();
	}
}
