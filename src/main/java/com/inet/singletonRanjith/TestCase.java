package com.inet.singletonRanjith;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TestCase {
	/*
	 * static Runnable useSingleTon(){ System.out.println("useSingleTon()");
	 * SingleTonRanjith instance = SingleTonRanjith.getInstance();
	 * System.out.println(instance.hashCode());
	 * 
	 * }
	 */
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			FileNotFoundException, IOException, CloneNotSupportedException {
		SingleTonRanjith instance1 = SingleTonRanjith.getInstance();
		SingleTonRanjith instance2 = SingleTonRanjith.getInstance();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());

		System.out.println("================SERIALIZATION/DESERILIZATION=========================");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/hashCode2.ser"));
		oos.writeObject(instance1);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/hashCode2.ser"));
		SingleTonRanjith sss = (SingleTonRanjith) ois.readObject();
		System.out.println("Hash code " + sss.hashCode());

		System.out.println("============Multi theaded=================");
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(TestCase::useSingleTon);
		service.submit(TestCase::useSingleTon);
		service.shutdown();

		System.out.println("==================clone===================");
		Object cloneObj = SingleTonRanjith.getInstance().clone();
		// SingleTonRanjith SingleTonRanjith1=(SingleTonRanjith)
		// cloneObj.clone();
		System.out.println("Clone: " + cloneObj.hashCode());

		System.out.println("===========Reflection=================");
		Class cls = Class.forName("com.inet.singletonRanjith.SingleTonRanjith");
		Constructor<SingleTonRanjith> ctr = cls.getDeclaredConstructor();
		ctr.setAccessible(true);
		SingleTonRanjith newInstance = ctr.newInstance();
		System.out.println(newInstance.hashCode());

	}

	private static void useSingleTon() {
		SingleTonRanjith s = SingleTonRanjith.getInstance();
		System.out.println("useSingleTon: " + s.hashCode());

	}
}
