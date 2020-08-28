package com.inet.metro;

public class Prime {
	public static void main(String[] args) {
		int n = 7;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("given no is prime");
		} else {
			System.out.println("given no is not prime");
		}
	}
}
