package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class EmploeeTest {
public static void main(String[] args) {
	
	Employee e1 = new Employee(9, "jhon", 43900);
	Employee e2 = new Employee(4, "hon", 43340);
	Employee e3 = new Employee(5, "mon", 3243);
	Employee e4 = new Employee(8, "keny", 4244);
	Employee e5 = new Employee(1, "harry", 13333);
	Employee e6 = new Employee(2, "hermoine", 5543);
	Employee e7 = new Employee(0, "ron", 8765);
	Employee e8 = new Employee(3, "snape", 9000);
	Employee e9 = new Employee(6, "dumbledoor", 12440);
	
	ArrayList<Employee> a = new ArrayList<Employee>();
	a.add(e1);
	a.add(e2);
	a.add(e3);
	
	ArrayList<Employee> a1 = new ArrayList<Employee>();
	a1.add(e4);
	a1.add(e5);
	a1.add(e6);
	
	ArrayList<Employee> a2 = new ArrayList<Employee>();
	a2.add(e7);
	a2.add(e8);
	a2.add(e9);
	
	HashMap<String, ArrayList<Employee>> h = new HashMap<String, ArrayList<Employee>>();
	h.put("first", a);
	h.put("second", a1);
	h.put("third", a2);

	ArrayList<Employee> a11 = h.get("third");
	Iterator<Employee> i = a11.iterator();
	while(i.hasNext()) {
		Employee e = i.next();
		System.out.println("id id " +e.id);
		System.out.println("name is "+e.name);
		System.out.println("salary is "+e.salary);
	}
	
}
}
