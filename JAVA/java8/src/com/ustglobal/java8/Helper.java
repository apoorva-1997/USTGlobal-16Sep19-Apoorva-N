package com.ustglobal.java8;

import java.beans.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;



public class Helper {

	void displayAllstudents(ArrayList<Student>a) {
		
		Iterator<Student> i = a.iterator();
		while(i.hasNext()) {
			Student s = i.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.marks);
			
			
		}
	}
	void displayFailedstudents(ArrayList<Student> a) {
		List<Student> l = a.stream().filter(i -> Student.marks < 40).collect(Collectors.toList());
		
		Iterator<Student> i = l.iterator();
		while(i.hasNext()) {
			Student i1 = i.next();
			System.out.println(i1.name);
			System.out.println(i1.id);
			System.out.println(i1.marks);
		}
	}
	
//	void displaypassstudents(ArrayList<Student> a) {
//		List<Student> l = a.stream().filter(i -> Student.marks >= 40).collect(Collectors.toList());
//		
//		Iterator<Student> i = l.iterator();
//		while(i.hasNext()) {
//			Student i1 = i.next();
//			System.out.println(i1.name);
//			System.out.println(i1.id);
//			System.out.println(i1.marks);
//		}
//		
//	}
	Comparator<Student> cmp = (m1,m2) -> {
		if(m1.marks>m2.marks) {
			return 1;
		}else if (m1.marks<m2.marks) {
			return -1;
		}else {
			return 0;
		}
	};
	void displayTopperstudents(ArrayList<Student> a) {
	 Student s = a .stream().max   (cmp).get();
	 System.out.println(s.name);
		System.out.println(s.id);
		System.out.println(s.marks);
		}
		
	}
	
	

