package com.inet.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class MaxValueInCollection {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 50);
		map.put(2, 60);
		map.put(3, 30);
		map.put(4, 100);
		map.put(5, 90);
		// int maxValueInMap = (Collections.max(map.values()));
		/*
		 * for (Entry<Integer, Integer> entry : map.entrySet()) {
		 * 
		 * if (entry.getValue() == maxValueInMap) {
		 * System.out.println(entry.getKey() + ":" + entry.getValue());
		 * 
		 * } }
		 */
		Integer max = Collections.max(map.values());
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == max) {
				System.out.println("max:" + entry.getKey() + ":" + entry.getValue());
			}
		}
		Integer min = Collections.min(map.values());
		for (Entry<Integer, Integer> entry1 : map.entrySet()) {
			if (entry1.getValue() == min) {
				System.out.println("min:" + entry1.getKey() + ":" + entry1.getValue());
			}
		}

	}

}
