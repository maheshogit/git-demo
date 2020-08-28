package com.inet.metro;

import java.util.Scanner;

public class ReverseStringWithoutPredefinedMethods {
@SuppressWarnings("resource")
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter String:");
	String str=scanner.next();
	String revstring="";
	for(int i=str.length()-1;i>=0;--i){
		revstring +=str.charAt(i);
	}
	System.out.print(revstring);
}

}
/*String str="Hello world";
String revstring="";
 
for(int i=str.length()-1;i>=0;--i){
revstring +=str.charAt(i);
}
 
System.out.println(revstring);*/