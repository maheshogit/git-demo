package com.inet.langpkg;

public class Student {
	String sname;
	int sno;
	public Student(String sname,int sno) {
		this.sname=sname;
		this.sno=sno;
	}
	
/*@Override
	public String toString() {
		return "Student [sname=" + sname + ", sno=" + sno + "]";
	}
*/
	public boolean equals(Object o){
		Student s1=(Student)o;
		if(sname.equals(s1.sname)&&sno==s1.sno){
			return true;
			
		}else{
			return false;
		}
	}
public int hashCode(){
	return sname.hashCode()+sno;
	}
public static void main(String[] args) {
	Student student1 = new Student("siva",10);
	Student student2 = new Student("rama",20);
	Student student3 = new Student("siva",10);
	System.out.println(student1);
	System.out.println(student2);
	System.out.println("Student of Equals(13):"+student1.equals(student3));
	//System.out.println("student of ==:"+student1==student3);
	Student student4=student1;
	System.out.println("Student of Equals(41):"+student4.equals(student1));
	//System.out.println("student of ==:"+student4==student4);
	String name=new String("harahara");
	Integer no = new Integer(101);
	System.out.println(name);
	System.out.println(no);
	
}
}
