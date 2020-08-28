package com.inet.sinlgeton;

public class UsedSecondSingleTon {
    public static void test(){
    	SingleTon instance = SingleTon.getInstance();
    	instance.m1();
    	instance.m2();
    	System.out.println(instance.hashCode());
    }
    public static void main(String[] args) {
		UsedSecondSingleTon.test();
	}
}
