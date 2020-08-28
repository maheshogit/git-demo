package com.inet.metro;

import java.io.IOException;
import java.util.Scanner;

public class AmstrongNumber {
public static void main(String[] args) throws IOException {
	 int n, sum = 0, temp, r;
	 
     Scanner in = new Scanner(System.in);

     System.out.println("Enter a number to check if it is an Armstrong number or not");     
     n = in.nextInt();

     temp = n;
     while( temp != 0 )
     {

        r = temp%10;
        sum = sum + r*r*r;
        temp = temp/10; 

     }

     if ( n == sum )
        System.out.println(n+"is an Armstrong number.");
     else
    	
        System.out.println(n+"  is not an Armstrong number.");  
}
}
