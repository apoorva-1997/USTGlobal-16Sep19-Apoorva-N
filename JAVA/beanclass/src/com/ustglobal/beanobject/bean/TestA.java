package com.ustglobal.beanobject.bean;

public class TestA {
public static void main(String[] args) {
	Student s = new Student();
	s.setId(12);
	s.setName("apppoooo");
	s.setRollno(10);
	
	Test t = new Test();
	t.recieve(s);
}
}
