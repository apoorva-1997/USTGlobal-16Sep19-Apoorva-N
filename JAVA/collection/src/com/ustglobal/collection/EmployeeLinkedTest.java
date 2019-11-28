package com.ustglobal.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeLinkedTest {
	public static void main(String[] args) {
		LinkedList<EmployeeLinked> l = new LinkedList<EmployeeLinked>();

		EmployeeLinked e1 = new EmployeeLinked(1, "A", 10);
		EmployeeLinked e2 = new EmployeeLinked(2, "B", 20);
		EmployeeLinked e3 = new EmployeeLinked(3, "C", 30);

		l.add(e1);
		l.add(e2);
		l.add(e3);


		System.out.println("*******for loop*********");

		for(int i=0 ;i<3 ;i++) {
			Object o = l.get(i);
			System.out.println(o);
		}
		//	for(int i=0 ;i<a.size() ;i++) {
		//	employee e = a.get(i);
		//	System.out.println(e.id);
		//	System.out.println(e.name);
		//	System.out.println(e.salary);
		//}
		System.out.println("*******foreach loop*********");	

		for(Object o :l) {
			System.out.println(l);
		}

		System.out.println("*******Iterator*********");

		Iterator i = l.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}	

		System.out.println("********ListIterator******");

		ListIterator li = l.listIterator();
		while(li.hasNext()) {
			Object o1 = li.next();
			System.out.println(o1);
		}

		System.out.println("********ListIterator hasprevious******");

		while(li.hasPrevious()) {
			Object o2 = li.previous();
			System.out.println(o2);
		}
	}
}
