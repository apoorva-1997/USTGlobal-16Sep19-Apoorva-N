package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestStudent{
	public static void main(String[] args) {

		ArrayList<Student> a = new ArrayList<Student>();

		Student s1 = new Student(1, 13, "Ammu");
		Student s2 = new Student(2, 95, "bhuna");
		Student s3 = new Student(6, 55, "pink");
		Student s4 = new Student(4, 53, "Jhon");

		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		System.out.println("before sorting");
		DispStuDetails(a);
		Collections.sort(a);
		System.out.println("after sorting");
		DispStuDetails(a);
		
		
		
	}
	
	static void DispStuDetails(ArrayList<Student> a) {
		Iterator<Student> i = a.iterator();	
		while(i.hasNext()) {
			Student s = i.next();
			System.out.println(s.id);
			System.out.println(s.marks);
			System.out.println(s.name);
		}
	}
}
