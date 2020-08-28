package com.inet.StringandSBandSB;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayApp {
	public static void main(String[] args) {
		Integer inputArray[] = { 1, 9, 4, 6, 1, 9, 4, 5 };
		/*
		 * Map<Integer, Integer> map = new HashMap<>(); for(int
		 * i=0;i<arr.length;i++){ if(map.containsKey(arr[i])){
		 * map.put(arr[i],map.values()+1); }
		 */
		/*
		 * Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
		 * 
		 * for (Integer str : arr) { if (counts.containsKey(str)) {
		 * counts.put(str, counts.get(str) + 1); } else { counts.put(str, 1); }
		 * } for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
		 * System.out.println(entry.getKey() + " = " + entry.getValue()); }
		 */
		HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();

		// checking every element of the inputArray

		for (int i : inputArray) {
			if (elementCountMap.containsKey(i)) {
				// If element is present in elementCountMap, incrementing it's
				// count by 1

				elementCountMap.put(i, elementCountMap.get(i) + 1);
			} else {
				// If element is not present in elementCountMap,
				// adding this element to elementCountMap with 1 as it's value

				elementCountMap.put(i, 1);
			}
		}

		//System.out.println("Input Array : " + Arrays.toString(inputArray));

		System.out.println("Element Count :::::::::::::::::" + elementCountMap);
		
		 	}

}
