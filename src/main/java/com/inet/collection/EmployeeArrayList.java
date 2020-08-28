package com.inet.collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArrayList {
	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(2, "Tom", 80000d));
		al.add(new Employee(56, "Sam", 75000d));
		al.add(new Employee(30, "Alex", 120000d));
		al.add(new Employee(25, "Peter", 60000d));

		System.out.println("Before sorting: " + al);

		//Collections.sort(al);

		System.out.println("After sorting: " + al);
		/*
		 * al.add(employee); al.add(employee3); al.add(employee1);
		 * al.add(employee2);
		 */

	}
}
