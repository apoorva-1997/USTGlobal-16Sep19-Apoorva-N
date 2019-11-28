package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class EmpTest {
public static void main(String[] args) {
	
	ArrayList<Employee> a = new ArrayList<Employee>();
	Employee e1 = new Employee(1, "ash");
	Employee e2 = new Employee(3,"Dhoni");
	Employee e3 = new Employee(2, "chir");
	a.add(e1);
	a.add(e2);
	a.add(e3);
	
	Comparator<Employee>cmp = (e4,e5) -> {
		return e4.name.compareTo(e5.name);
	};
	List<Employee> l = a.stream().sorted(cmp).collect(Collectors.toList());
	
	
	Iterator<Employee> i = l.iterator();
	while(i.hasNext()) {
		Employee i1 = i.next();
		System.out.println(i1.name);
		System.out.println(i1.id);
	}
	
}
}
