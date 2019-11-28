package com.ustglobal.arrays;

public class TestC {
public static void main(String[] args) {
	Student s1 = new Student(1, "wefcD", 90);
	Student s2 = new Student(2, "FDVFDSB", 40);
	Student s3 = new Student(3, "crh", 56);

	Student[] students = new Student[3];
	students[0] =s1;
	students[1] = s2;
	students[3] = s3;

	for(Student s: students) {
		System.out.println(s);
	}
	recieve(students);
}
private static void recieve(Student[] stu) {
	for(Student s : stu) {
		System.out.println(s);
	}	
}
}
