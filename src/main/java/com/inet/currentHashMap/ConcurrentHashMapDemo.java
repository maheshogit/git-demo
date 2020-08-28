package com.inet.currentHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		//Map<String, String> cMap = new ConcurrentHashMap();
		Map<String, String> cMap = new HashMap();
		cMap.put("emp_1", "siva");
		cMap.put("emp_2", "rama");
		Iterator<String> iterator = cMap.keySet().iterator();
		while (iterator.hasNext()) {
			
			System.out.println(cMap.get(iterator.next()));
			//Iterator<String> iterator1 = cMap.keySet().iterator();
			cMap.put("emp_3", "mahesh");

		}
		
//		System.out.println("after");
//		while (iterator1.hasNext()) {
//			System.out.println(cMap.get(iterator1.next()));
//
//		}

	}

}
