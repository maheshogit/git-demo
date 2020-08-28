package com.inet.practice;

import java.util.Arrays;

public class AsOrder {

	public static void main(String[] args) {
		/*String str = "1-2,2-2,2-4,1-8";
		String[] split = str.split(str);
		Arrays.sort(split);
		for (String string : split) {
			System.out.println(string);
		}
*/		
		String[] arr = new String[] { "1-2", "2-2", "2-4", "4-2", "4-3", "3-8", "5-8", "7-9", "1-8", "2-5" };

		Arrays.sort(arr);

		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
		 */
		for (String arr2 : arr) {
			System.out.println(arr2);
		}

	}

}
