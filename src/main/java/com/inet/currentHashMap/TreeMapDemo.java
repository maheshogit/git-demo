package com.inet.currentHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TreeMapDemo {
	public static  void main(String[] args) {
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("emp_1", "siva");
		hashMap.put("emp_2", "rama");
		hashMap.put("emp_3", "mahadav");
		hashMap.put("emp_4", "harahara");
		Iterator<String> iterator = hashMap.keySet().iterator();
		System.out.println(hashMap.keySet());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			hashMap.put("emp_5", "mahesh");
			
		}
	}

}//Exception in thread "main" java.util.ConcurrentModificationException
