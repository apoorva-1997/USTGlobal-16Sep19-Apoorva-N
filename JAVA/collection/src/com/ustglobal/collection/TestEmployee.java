package com.ustglobal.collection;

	import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestEmployee {
	public static void main(String[] args) {
		ArrayList<employee> a = new ArrayList<employee>();
		employee e1 = new employee(1, "Apooo", 30000);
		employee e2 = new employee(2, "Amooo", 40000);
		employee e3 = new employee(3, "Ratna", 50000);

		a.add(e1);
		a.add(e2);
		a.add(e3);
		
		System.out.println("*******for loop*********");
		
		for(int i=0 ;i<3 ;i++) {
			Object o = a.get(i);
			System.out.println(o);
		}
//		for(int i=0 ;i<a.size() ;i++) {
//		employee e = a.get(i);
//		System.out.println(e.id);
//		System.out.println(e.name);
//		System.out.println(e.salary);
//	}
		System.out.println("*******foreach loop*********");	

		for(Object o :a) {
		System.out.println(a);
		}
		
		System.out.println("*******Iterator*********");
		
		Iterator i = a.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}	
		
		System.out.println("********ListIterator******");
		
		ListIterator li = a.listIterator();
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

