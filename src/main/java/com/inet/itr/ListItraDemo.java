package com.inet.itr;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListItraDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("siva");
		ll.add("rama");
		ll.add("harahara");
		ll.add("maheswara");
		System.out.println(ll);

		ListIterator listIterator = ll.listIterator();

		while (listIterator.hasNext()) {
			String str = (String) listIterator.next();
			if (str.equals("rama")) {
				listIterator.remove();
			} else if (str.equals("siva")) {
				listIterator.add("mahadav");
			} else if (str.equals("maheswara")) {
				listIterator.set("verabadra");

			}else if (str.equals("rama")) {
				listIterator.hasPrevious();
			}
			

		}
		System.out.println(ll);
	}

}
