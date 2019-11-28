package com.ustglobal.sorting.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class EmployeeTEst {
	public static void main(String[] args) {

		HashSet<Employee> h = new LinkedHashSet<Employee>();
		Employee e1 = new Employee(200000, "asc", 1);
		Employee e2 = new Employee(30000, "snc", 200);
		Employee e3 = new Employee(10000, "ska", 3);
		Employee e4 = new Employee(50000, "amn", 40);
		Employee e41 = new Employee(50000, "amn", 40);  //duplicates are allowed

		h.add(e1);
		h.add(e2);
		h.add(e3);
		h.add(e4);
		h.add(e41);

		System.out.println("**********************Iterator");
		Iterator<Employee> i = h.iterator();
		while(i.hasNext())
		{
			Employee e = i.next();
			System.out.println(e.id);
			System.out.println(e.salary);
			System.out.println(e.name);
		}
	}
}
