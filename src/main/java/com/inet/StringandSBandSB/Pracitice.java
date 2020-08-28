package com.inet.StringandSBandSB;

import java.util.HashMap;

public class Pracitice {
	public void separationOfNoAndAlpha(){
		String str= "M1A2H3E4S5H";
		char[] charArray = str.toCharArray();
		String a="";
		String n="";
		for(Character ch : charArray){
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <='Z')){
				a = a +ch;
			}else
			{
				n = n+ch;
			}
		}
		System.out.println(a);
		System.out.println(n);
	}
	
	public void separationOfNoAndAlphaSecond(){
		String str= "M1A2H3E4S5H";
		char[] charArray = str.toCharArray();
		String a="";
		String n="";
		for(Character ch : charArray){
			if(Character.isDigit(ch)){
				n = n +ch;
			}else
			{
				a = a+ch;
			}
		}
		System.out.println(a);
		System.out.println(n);
	}
	public void StringCount(){
		String str= "mahesh";
		System.out.println(str.length());
				
	}
	public void StringCountPlusOne(){
		String str="mahesh";
		HashMap<Character, Integer> hashMap = new HashMap<Character,Integer>();
		char[] ch = str.toCharArray();
		for(char c : ch){
			if(hashMap.containsKey(c)){
				hashMap.put(c, hashMap.get(c)+1);
			}else{
				hashMap.put(c, 1);
			}
		}
		System.out.println("mahesh:"+hashMap);
	}
	public void hashMapDemo(){
		String s1="FB";
		String s2="FB";
		HashMap<String, Integer> hm=new HashMap<String, Integer>();		
								hm.put("aa", 1);
								hm.put("bb", 2);
								System.out.println(s1.hashCode()+":" +s2.hashCode());
								System.out.println(hm);
}
	public static void main(String[] args) {
		
		Pracitice pracitice = new Pracitice();
		pracitice.separationOfNoAndAlpha();
		pracitice.separationOfNoAndAlphaSecond();
		pracitice.StringCount();
		pracitice.StringCountPlusOne();
		pracitice.hashMapDemo();
		
	}
}
