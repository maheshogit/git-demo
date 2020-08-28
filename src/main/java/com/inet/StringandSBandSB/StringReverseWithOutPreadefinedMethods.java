package com.inet.StringandSBandSB;

public class StringReverseWithOutPreadefinedMethods {
	public static void main(String[] args) throws InterruptedException {
		String name = "siva is good boy";
		char[] charArray = name.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			// System.out.print(i);
			Thread.sleep(1000);
			System.out.print(charArray[i]);
		}
	}
}
