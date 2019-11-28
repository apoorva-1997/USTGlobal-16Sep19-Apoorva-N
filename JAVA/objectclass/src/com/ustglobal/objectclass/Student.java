package com.ustglobal.objectclass;

public class Student {
	
	int id;
	String name;
	double marks;

	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

@Override
public int hashCode() {
	return id;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
}
 

}
