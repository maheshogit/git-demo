package com.inet.metro;

public class AddGivenNums {
public static void main(String[] args) {
	int sum=0;
	int i=123;
	while(i!=0){
		int s=i%10;
		sum=sum+s;
		i=i/10;
	}
	System.out.println(sum);
}
}
