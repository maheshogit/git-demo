package com.inet.metro;

public class Polindrume {

	public static void main(String[] args) {
		int i=11511;
		int reverseNum=0;
		int temp=i;
		while(i!=0){
			int s=i%10;
			reverseNum=((reverseNum*10)+s);
			i=i/10;
		}
		if(temp==reverseNum){
			System.out.println("given no is polindrume");
		}else{
			System.out.println("given no is not polindrume");
		}

	}

}
