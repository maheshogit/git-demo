package com.inet.StringandSBandSB;

public class PracticeWIthOutPredefinedMethods {
	public static void main(String[] args) {
		String str = "this is siva";
		char[] charArray = str.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}

}
