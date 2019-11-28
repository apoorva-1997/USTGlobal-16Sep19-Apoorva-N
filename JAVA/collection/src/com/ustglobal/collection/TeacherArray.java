package com.ustglobal.collection;

public class TeacherArray {
	String name;
	double salary;
	String quali;

	public TeacherArray(String name, double salary, String quali) {
		super();
		this.name = name;
		this.salary = salary;
		this.quali = quali;
	}

	@Override
	public String toString() {
		return "TeacherArray [name=" + name + ", salary=" + salary + ", quali=" + quali + "]";
	}


}
