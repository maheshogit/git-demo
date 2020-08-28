package com.inet.StringandSBandSB;

import java.util.*;
class Intrest 
{
	Intrest()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter original amount");
	float p=s.nextFloat();

	System.out.println("enter months");
	int t=s.nextInt();

	System.out.println("enter days");
	int d=s.nextInt();

	System.out.println("enter interst");
	float r=s.nextFloat();

	float mt=(p*t*r)/100;
	System.out.println(+t+" months intrest: " +mt);

	float td1=mt/t;
	System.out.println("this is for month: " +td1);


	float td=td1/30;
	System.out.println("this is for day interst: "+td);
	
	float tdd=td*d;
    System.out.println( +d+ " days to interst: " +tdd);
	float ti=mt+tdd;
	System.out.println("Total amount of intrest: "+ti);
	float total=p+ti;
	System.out.println("Total amount: "+total);

  }
	public static void main(String[] args) 
	{
		Intrest t =new Intrest();
		}
}
