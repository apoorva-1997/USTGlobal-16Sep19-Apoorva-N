package com.ustglobal.collection;

public class EmpVector {
	int id;
	String name;
	double salary;

	public EmpVector(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


}
