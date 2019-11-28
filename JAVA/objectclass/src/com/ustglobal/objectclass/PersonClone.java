package com.ustglobal.objectclass;

public class PersonClone implements Cloneable {
	int age;
	String name;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public PersonClone(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

}
