package com.inet.metro;

public class ReverseGivenNumber {
public static void main(String[] args) {
	int i=521;
	int reverseNum=0;
	while(i!=0){
		int s=i%10;
		reverseNum=((reverseNum*10)+s);
		i=i/10;
		System.out.println(reverseNum);
	}
}
}
