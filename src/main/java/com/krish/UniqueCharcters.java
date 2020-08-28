package com.krish;

public class UniqueCharcters {
	public static void main(String args[]) {/*
		String str = "sandeep kumar k";
		Set<Character> set = new LinkedHashSet<Character>();
			for (int i = 0; i <= str.length() - 1; i++) {
			set.add(str.charAt(i));
		}
		System.out.println(set);
	*/
		
		String first="AAABBCCCCDDD";
		String newFirst="";
		for(int i=0;i<first.length();i++)
		{ 
		     if(newFirst.indexOf(first.charAt(i))==-1)
		      newFirst+=first.charAt(i);
		}
		System.err.println("The Unique Charactes in the String:"+newFirst);

	String str = "sandeep kumar kumar";
	String temp = "";
	
	for(int i=0;i<str.length();i++){
		if(temp.indexOf(str.charAt(i))== -1){
			temp+=str.charAt(i);
		}
		
	}System.out.println(temp);
	
	}

}
