package com.ustglobal.java8;

import java.util.ArrayList;

public class TestV {
	public static void main(String[] args) {
		ArrayList<Student>a = new ArrayList<>();
		a.add(new Student (5,"vik",34.5));
		a.add(new Student (3,"ram",56.5));
		a.add(new Student (4,"ama",45.5));
		a.add(new Student (2,"shyam",55.5));
		a.add(new Student (9,"bam",80.5));
		a.add(new Student (1,"lak",33.5));
		
		Helper h = new Helper();
//		h.displayAllstudents(a);
//		h.displayFailedstudents(a);
		h.displayTopperstudents(a);
	}
}
