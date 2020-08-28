package com.inet.practice;

import java.util.Comparator;
import java.util.TreeSet;

public class AssendingOrder {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet(new MyComparator());
		/*t.add(new StringBuffer("2-1"));
		t.add(new StringBuffer("1-2"));
		t.add(new StringBuffer("2-4"));
		t.add(new StringBuffer("4-2"));*/
		t.add("2-1");
		t.add("1-2");
		t.add("2-4");
		t.add("4-2");
		t.add("4-3");
		t.add("3-8");
		t.add("5-8");
		t.add("7-9");
		t.add("1-8");
		t.add("2-5");
		System.out.println(t);
	}
}

class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s1.compareTo(s2);
	}
}
