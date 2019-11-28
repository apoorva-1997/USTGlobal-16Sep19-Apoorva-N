package com.ustglobal.objectclass;

public class StudentTest {
	public static void main(String[] args) {
		
		Student s = new Student(12, "Apooo", 70);
		
		int s1 = s.hashCode();
		System.out.println(s1);
		
		String s2 = s.toString();
		System.out.println(s2);
	}
}
