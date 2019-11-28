package com.ustglobal.java8.features;

import java.util.function.Supplier;

public class Suppilier1 {

	public static void main(String[] args) {
		Supplier<Student> s =() -> new Student(9, "ron", 23);
		Student s1 = s.get();
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.marks);
		
		Supplier<Integer> i =() ->  20;
		int value = i.get();
		System.out.println(value);
		
		Supplier<String> i1 =() -> "evenin";
		String val = i1.get();
		System.out.println(val);
		
	}
}
