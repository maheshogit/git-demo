package com.inet.collection;

import java.util.Comparator;

public class Employee implements Comparator {
	private Integer eid;
	private String ename;
	private Double esalary;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getEsalary() {
		return esalary;
	}

	public void setEsalary(Double esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}

	public Employee(Integer eid, String ename, Double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int compareTo(Employee e) {
		if (eid.equals(e.eid))
			return eid - e.eid;
		return eid.compareTo(e.eid);
	}

	public int compare(Object obj1, Object obj2) {
		Employee e1 = (Employee) obj1;
		Employee e2 = (Employee) obj2;
		String s1 = e1.ename;
		String s2 = e2.ename;

		return s1.compareTo(s2);
	}

}
