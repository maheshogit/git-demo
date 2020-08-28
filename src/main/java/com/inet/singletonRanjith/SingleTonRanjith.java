package com.inet.singletonRanjith;

import java.io.Serializable;

import com.inet.sinlgeton.Singleton2;

public class SingleTonRanjith extends Singleton2 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SingleTonRanjith singleRanjith = null;

	private SingleTonRanjith() {
		if (singleRanjith != null) {
			throw new RuntimeException("YOU CON'T CREATE PLZ USE EXISTING ONE");
		}
		System.out.println("this singleton ctr");
	}

	public static SingleTonRanjith getInstance() {
		if (singleRanjith == null) {//single checking
			synchronized (SingleTonRanjith.class) {//class level locking it means when ever we mention that class at synchronized block
				if(singleRanjith==null){//double checking
					singleRanjith = new SingleTonRanjith();
				}
				
			}
			
		}
		return singleRanjith;

	}
	public Object clone() throws CloneNotSupportedException {
        return singleRanjith;
   }	
	// ser/desc
	private Object readResolve() {
		System.out.println("ser/dese readResolve()");
		return singleRanjith;

	}
}

