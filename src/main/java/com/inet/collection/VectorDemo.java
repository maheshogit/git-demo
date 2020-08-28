package com.inet.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("siva");
		v.add("rama");
		v.add("krish");
		v.add("null");
		//v.remove(0)
		v.remove(0);
		//((Vector) v).addElement("mahesh");
		System.out.println(v);
		Enumeration elements = ((Vector) v).elements();
		while(elements.hasMoreElements()){
			System.out.println(elements.nextElement());
		}
 	}
}
