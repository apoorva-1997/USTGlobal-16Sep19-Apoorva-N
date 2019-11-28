package com.ustglobal.beanclass2.bean2;

public class TestA {
public static void main(String[] args) {
	Employee e = new Employee();
	e.setDeptno(19);
	e.setDesignation("s d");
	e.setId(12);
	e.setName("asd");
	e.setSalary(30000);
	
	Test t = new Test();
	t.receive (e);
}


}
