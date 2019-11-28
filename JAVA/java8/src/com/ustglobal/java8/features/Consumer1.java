package com.ustglobal.java8.features;

import java.util.function.Consumer;

public class Consumer1 {
public static void main(String[] args) {
	Consumer <Student> c = s ->{
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.marks);
	};
	Student s1 = new Student(9, "ron", 34) ;
	c.accept(s1);
}
}
