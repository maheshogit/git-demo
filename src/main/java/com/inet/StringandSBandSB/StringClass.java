package com.inet.StringandSBandSB;

public class StringClass {
	public static void main(String[] args) {
           String str="siva";
           System.out.println(str.length());
           String concat = str.concat("mahesh");
           System.out.println(concat);
		/*
		 * String s1 = new String("siva"); String s2 = new String("siva");
		 * String s3 = "siva"; String s4 = "siva";
		 * System.out.println("s1.equalss2::"+s1.equals(s2));//t
		 * System.out.println("s2==s1::"+s2==s1);//f
		 * System.out.println("s2==s3::"+s3==s4);//f
		 * 
		 * System.out.println("s4.equalss3::"+s4.equals(s3));//t
		 * System.out.println("s1==s4::"+s1==s4);//f
		 * 
		 * 
		 * s1.concat("kilasa"); s1.concat("giri"); s1.concat("harahara");
		 * s1+="golashankara";
		 * 
		 * String s5=s1.concat("maheshwara"); String s6=s1+"mahadheva";
		 * System.out.println(s6);//sivagolashankaramahadheva
		 * System.out.println(s5);//sivagolashankaramaheshwara
		 * System.out.println(s1);//sivagolashankara
		 */

		System.out.println("======================================");
		String s1 = new String("you con't change me!");
		String s2 = new String("you con't change me!");
		String s11 = s1;
		System.out.println("S1 hashCode:" + s1.hashCode());
		System.out.println("S11 hashCode:" + s11.hashCode());
		System.out.println("s2 hashCode:" + s2.hashCode());

		System.out.println("s1==s2:" + s1 == s2);// f
		String s3 = "you con't change me!";
		System.out.println("s3 hash code:" + s3.hashCode());// f
		String s4 = "you con't change me!";
		System.out.println(s1 == s4);// f
		System.out.println(s1 == s3);// f
		System.out.println(s3 == s4);// t
		String s5 = "you con't" + " change me!";
		System.out.println(s3 == s5);// t
		String s6 = "you con't";
		String s7 = s6 + " change me!";

		System.out.println("s7" + s7.hashCode());
		System.out.println("s3.equals(s7)" + s3.equals(s7));// t

		System.out.println(s3 == s7);// f
		final String s8 = "you con't";
		System.out.println(s6 == s8);// t
		String s9 = s8 + " change me!";
		System.out.println(s3 == s9);// t
		System.out.println(s6 == s3);// f
	}

}
