
package com.ustglobal.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestStudent {
public static void main(String[] args) {
	ArrayList<Student> a = new ArrayList<Student>();
	Student s1 = new Student(23, "asd", 45);
	Student s2 = new Student(45, "ghv", 67);
	Student s3 = new Student(66, "vad", 77);
	
	a.add(s1);
	a.add(s2);
	a.add(s3);
	System.out.println("forloop");
	for(int i=0 ;i<a.size();i++) {
		Student s = a.get(i);
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.marks);
	}
	System.out.println("for each");
	
	for(Student s :a) {
		System.out.println(s);
	}
	
	System.out.println("iteratot");
	
	Iterator i = a.iterator(); 
	while(i.hasNext()) {
		Object o1 = i.next();
		System.out.println(o1);
	}
	
	System.out.println("list iteratotr");
	ListIterator l1 = a.listIterator();
	while(l1.hasNext()){
		Object o3 = l1.next();
		System.out.println(o3);
	}
}
}
