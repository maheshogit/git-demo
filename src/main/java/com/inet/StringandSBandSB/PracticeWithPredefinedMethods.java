package com.inet.StringandSBandSB;

import java.util.Scanner;

public class PracticeWithPredefinedMethods {
	public void PracticeWithPredefinedMethod() {
		String name = "this is siva";
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(name);
		StringBuffer reverse = stringBuffer.reverse();
		System.out.println(reverse);//avis si siht
	}

	public void PracticeWithOutPredefinedMethod() {
		String name2 = "this is rama";
		char[] charArray = name2.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);//amar si siht
		}
	}

/*	public void splitReverse() {
		String name2 = "this is mahesh";
		// String array[] = null;
		String[] split = name2.split(" ");

		int count = split.length;
		System.out.println(count);
		for (String string : split) {

			char[] ch = string.toCharArray();

			for (int i = ch.length - 1; i >= 0; i--) {
				//System.out.print("data: "+ch[i]);
			}
			System.out.print(" ");
			System.out.println("mahesh::::::::::"+ch);
		}
	}
*/
	public void countWordsInSentence() {
		String s = "welcome to candid java tutorial";
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println();
		System.out.println("Number of words in a string = " + count);
	}

	public void swap() {
		int a = 10;
		int b = 20;
		System.out.println("before swapping::" + a + "======" + b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("before swapping::" + a + "=====" + b);
	}

	public void swapWithOutTemp() {
		int a = 10;
		int b = 20;
		System.out.println("before swapping::" + a + "======" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("before swapping::" + a + "=====" + b);
	}

	public void polindrume() {
		int i = 121;
		int rev = 0;
		int temp = i;
		while (i != 0) {
			int s = i % 10;
			rev = ((rev * 10) + s);
			i = i / 10;
		}
		if (rev == temp) {
			System.out.println("polindrume in int");
		} else {
			System.out.println("not polindrume in int");
		}
	}

	public void reverse() {
		int i = 125;
		int rev = 0;
		while (i != 0) {
			int s = i % 10;
			rev = ((rev * 10) + s);
			i = i / 10;
		}
		System.out.println(rev);
	}

	public void polindrumeStrins() {
		String str = "madam", rev = "";
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		// System.out.println(rev);
		if (str.equals(rev)) {
			System.out.println(str + " is a palindrome in string");
		} else {
			System.out.println(str + " is not a palindrome in string");
		}
	}

	public void factorial() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number whose factorial you want: ");
		int n = in.nextInt();
		int f = 1;
		for (int i = n; i > 0; i--) {
			f = f * i;
		}
		System.out.println("Factorial of " + n + " is " + f);
	}

	public void floydriangle() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows which you want in your Floyd Triangle: ");
		int r = in.nextInt();
		int n = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(++n + " ");
			}
			System.out.println();
		}}

	public void fibonacciSeries() {
		int pri = 0, cval = 1, next;
		System.out.print("fibonacciSeries:" + pri + " " + cval);
			for(int i = 2; i <= 5; i++) {
				next = pri + cval;
				System.out.print(" " + next);
				pri = cval;
				cval = next;
			}
		}
	public static void main(String[] args) {
		PracticeWithPredefinedMethods methods = new PracticeWithPredefinedMethods();
		methods.PracticeWithPredefinedMethod();
		methods.PracticeWithOutPredefinedMethod();
		methods.swap();
		methods.polindrume();
		methods.polindrumeStrins();
		methods.swapWithOutTemp();
		methods.reverse();
	//	methods.splitReverse();
		
		methods.countWordsInSentence();
		methods.factorial();
		methods.floydriangle();
		methods.fibonacciSeries();
	}
}
