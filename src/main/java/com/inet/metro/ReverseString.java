package com.inet.metro;

public class ReverseString {
public static void main(String[] args) {
	String input="Siva";
	StringBuffer buffer = new StringBuffer();
	buffer.append(input);
	buffer=buffer.reverse();
	for(int i=0;i<buffer.length();i++){
		System.out.print(buffer.charAt(i));
	}
}
}
