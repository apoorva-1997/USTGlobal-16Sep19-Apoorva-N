package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class StudentTest {
public static void main(String[] args) {
	Student s1 =  new Student(1, "anu", 67);
	Student s2 =  new Student(10, "manu", 37);
	Student s3 =  new Student(99, "kanu", 33);
	Student s4 =  new Student(13, "ranu", 23);
	Student s5 =  new Student(16, "danu", 47);
	Student s6 =  new Student(78, "sanu", 77);
	Student s7 =  new Student(22,"canu", 68);
	Student s8 =  new Student(31, "hanu", 86);
	Student s9 =  new Student(31, "lanu", 92);

	ArrayList<Student> a = new ArrayList<>();
	a.add(s1);
	a.add(s2);
	a.add(s3);
	
	ArrayList<Student> a1 = new ArrayList<>();
	a1.add(s4);
	a1.add(s5);
	a1.add(s6);
	
	ArrayList<Student> a2 = new ArrayList<>();
	a2.add(s7);
	a2.add(s8);
	a2.add(s9);
	
	HashMap<String, ArrayList<Student>>  h = new HashMap<String, ArrayList<Student>>();
	h.put("first", a);
	h.put("second", a1);
	h.put("third", a2);
	ArrayList<Student> first = 	h.get("second");
	
	Iterator<Student> i = first.iterator();
	while(i.hasNext()) {
		Student s = i.next();
		System.out.println("id id " +s.id);
		System.out.println("name is "+s.name);
		System.out.println("marks is "+s.marks);
	}

	

}
	


}
