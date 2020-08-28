package com.inet.metro;

public class CreditNumber {
	public static void main(String[] args) {
		
	
	String existingCCNmbr = "4114360123456785";
    int i = 0;
    StringBuffer temp = new StringBuffer();
    while(i < (existingCCNmbr .length())){
    	
        if(i > existingCCNmbr .length() -5){
            temp.append(existingCCNmbr.charAt(i));
        } else {
            temp.append("X");
        }
        i++;
    }
       System.out.println(temp);
       }
}

