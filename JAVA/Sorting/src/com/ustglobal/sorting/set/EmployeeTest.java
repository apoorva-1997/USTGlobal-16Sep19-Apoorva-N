package com.ustglobal.sorting.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class EmployeeTest {
	public static void main(String[] args) {

//		Comparator<Employee> comp = (e1,e2) -> {
//			if(e1.height >e2.height) {							//sort by height
//				return 1;
//			}else if(e1.height < e2.height) {
//				return -1;
//			}else {
//				return 0;
//			}
//		};
		
//		Comparator<Employee> comp = (e1,e2) -> {				//sort by name by lambda expression
//			return e1.name.compareTo(e2.name);
//		};
		

		Comparator<Employee> comp = (e1,e2) -> {
			if(e1.id >e2.id) {							//sort by id
				return 1;
			}else if(e1.id < e2.id) {
				return -1;
			}else {
				return 0;
			}
		};

		TreeSet<Employee> t = new TreeSet<Employee>(comp);

		Employee e1 = new Employee(3, "A", 5.5);
		Employee e2 = new Employee(2, "C", 4.8);
		Employee e3 = new Employee(1, "B", 6.1);
		Employee e4 = new Employee(4, "D", 3.9);

		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);

		System.out.println("******************Iterator");
		Iterator<Employee> i = t.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println("height is " +e.height);
			System.out.println("name is " +e.name);
			System.out.println("id is " +e.id);
		}
	}
}
