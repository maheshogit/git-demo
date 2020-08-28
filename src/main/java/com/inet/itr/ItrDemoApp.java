package com.inet.itr;

import java.util.ArrayList;
import java.util.Iterator;

public class ItrDemoApp {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		for (int i = 1; i <= 10; i++) {
			arrayList.add(i);
			System.out.println(i);

		}
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Integer i = (Integer) iterator.next();
			if (i % 2 == 0)
				System.out.println(i);
			else
				iterator.remove();

		}
		System.out.println(arrayList);
	}

}
