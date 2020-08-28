package com.inet.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator1());
		t.add(67);
		t.add(88);
		t.add(76);
		System.out.println(t);
	}
}

class MyComparator1 implements Comparator {

	public int compare(Object obj1, Object obj2) {

		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;
		/*if (i1 < i2)
			return +1;
		else if (i1 > i2)
			return -1;
		else
			return 0;*/
		//or
		//return i2.compareTo(i1);//desending order
		//return i1.compareTo(i2);//assending order//
		//return +1;//insertion order
        //return -1;//reverse of insertion order	
		return 0;//only first element will be inserted&&all remaining are considered duplicates
	}

}
