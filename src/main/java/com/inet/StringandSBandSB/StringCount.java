package com.inet.StringandSBandSB;

public class StringCount {
	public static void main(String[] args) {
		int wrap = 1212;
		Integer pol = wrap;
		int rev = 0;
		int temp = pol;
		int j = 0;
		String str = Integer.toString(pol);
		for (int i = pol.SIZE; i >= 0; i--) {
			if (pol != 0) {
				j = pol % 10;
				rev = (rev * 10) + j;
				pol = pol / 10;
			}
		}
		if (temp == rev) {
			System.out.println("polindrome");
		} else {
			System.out.println("not ");
		}
	}

}
