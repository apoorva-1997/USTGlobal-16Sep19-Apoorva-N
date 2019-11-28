package com.ustglobal.java8.features;

import java.util.function.Function;

public class Function2 {
	public static void main(String[] args) {
		Function <Integer,Student> f =id -> {
			Student s = new Student (2,"vijji",78.8);
			s.id = id;
			return s;
		};
		Student s = f.apply(27);
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.marks);
	}
}
