package com.inet.metro;

public class FizzBuzz {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			boolean fizzorBuzz=false;
			if(i%3==0){
				System.out.println("Fizz");
				fizzorBuzz=true;
			}
			if(i%5==0){
				System.out.println("Buzz");
				fizzorBuzz=true;
			}
			if(fizzorBuzz){
				System.out.println("fizzorbuzz");
			}else{
				System.out.println(String.valueOf(i));
			}
		}
	}

}
