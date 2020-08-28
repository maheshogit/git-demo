package com.specila.number.character;

import java.util.HashMap;
import java.util.Map;

public class IdentificationOfCharDigitsSpecial {
	
	public static void main(String[] args) {
		int ch= 0;
		int nu= 0;
		int sp =0;
		String s="jaaaaaaaaaaava11111123@#$$$$$$$$$$$$$";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < s.length(); i++) {
		  char c = s.charAt(i);
		  if (map.containsKey(c)) {
		    int cnt = map.get(c);
		    map.put(c, ++cnt);
		  } else {
		    map.put(c, 1);
		  }
		}
		System.out.println(map);
		char[] charArray = s.toCharArray();
		for(int i=0;i<charArray.length; i++){

			if(Character.isLetter(charArray[i]))
			{
                ch++;
			}
			else if(Character.isDigit(charArray[i]))
			{
				nu++;
				
			}
			else
			{
				sp++;
				

			}
		}
		System.out.println("character count :"+ch);
		System.out.println("number count :"+nu);
		System.out.println("special count :"+sp);
	}
}
