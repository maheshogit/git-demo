package com.inet.metro;

import java.util.Scanner;

public class EvenorOdd {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int i = scanner.nextInt();
		if(i%2==0){
			System.out.println("given no is even number");
		}else{
			System.out.println("given no is odd number");
		}
	}

}
