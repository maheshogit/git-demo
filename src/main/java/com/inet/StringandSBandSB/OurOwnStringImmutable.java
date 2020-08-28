package com.inet.StringandSBandSB;

public final class OurOwnStringImmutable {

	private final int i;

	public OurOwnStringImmutable(int i) {
		this.i = i;
	}

	public OurOwnStringImmutable modify(int j) {
		if (this.i == j)
			return this;
		return (new OurOwnStringImmutable(j));

	}

	public static void main(String[] args) {
		OurOwnStringImmutable s1 = new OurOwnStringImmutable(10);
		OurOwnStringImmutable s2 = new OurOwnStringImmutable(100);
		OurOwnStringImmutable s3 = new OurOwnStringImmutable(1000);
		System.out.println(s3.i);
		System.out.println("s1 hashcode:" + s1.hashCode());
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println("s3 hashcode:" + s3.hashCode());
		System.out.println("s2 hashcode:" + s2.hashCode());
		//OurOwnStringImmutable modify = s3.modify(10);
		//System.out.println(modify);
		OurOwnStringImmutable s4=s3.modify(10);
		System.out.println(s4.i);
		System.out.println("s3 hashcode:" + s3.hashCode());
	}
}
