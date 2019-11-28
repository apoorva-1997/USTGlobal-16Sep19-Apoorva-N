package com.ustglobal.objectclass;

public class PersonTest  {
	public static void main(String[] args) throws CloneNotSupportedException {
		PersonClone p = new PersonClone(12, "asd");
		System.out.println("p age " +p.age);
		System.out.println("p name " +p.name);

		Object o = p.clone();
		PersonClone p1 = (PersonClone) o;
		System.out.println(p1.age);
		System.out.println(p1.name);
		p1.age = 19;
		p1.name= "apoo";
		System.out.println(p1.age);
		System.out.println(p1.name);
	}
}








