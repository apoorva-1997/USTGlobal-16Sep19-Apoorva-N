package com.ustglobal.collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class EmpvectorTest {
public static void main(String[] args) {
	
	Stack <EmpVector>v = new Stack<EmpVector>();
	
	EmpVector e1 = new EmpVector(1, "A", 12);
	EmpVector e2 = new EmpVector(2, "B", 13);
	EmpVector e3 = new EmpVector(3, "C", 14);
	v.add(e1);
	v.add(e2);
	v.add(e3);
	
	System.out.println("*******for loop*********");

	for(int i=0 ;i<3 ;i++) {
		Object o = v.get(i);
		System.out.println(o);
	}
	//	for(int i=0 ;i<v.size() ;i++) {
	//	EmpVector e = v.get(i);
	//	System.out.println(e.id);
	//	System.out.println(e.name);
	//	System.out.println(e.salary);
	//}
	System.out.println("*******foreach loop*********");	

	for(Object o :v) {
		System.out.println(v);
	}

	System.out.println("*******Iterator*********");

	Iterator i = v.iterator();
	while(i.hasNext()) {
		Object o = i.next();
		System.out.println(o);
	}	

	System.out.println("********ListIterator******");

	ListIterator li = v.listIterator();
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
