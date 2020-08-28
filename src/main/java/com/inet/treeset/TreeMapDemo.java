package com.inet.treeset;

import java.util.TreeSet;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("bbb");
		t.add("aaa");
		t.add("ZZZ");
		t.add("LLL");
		//Collections.sort(t);
		System.out.println(t);
	}
}

/*class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s1.compareTo(s2);
	}*/
//}
