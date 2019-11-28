package com.ustglobal.sorting.list;

public class Student  implements Comparable<Student>{
	
	int id;
	double marks;
	String name;
	
	public Student(int id, double marks, String name) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public int compareTo(Student s) {
//		Integer  i  = this.id;
//		Integer j = s.id;
//		return i.compareTo(j);
		return this.id - s.id;
	}

//	@Override
//	public int compareTo(Student s) {
//		if(this.id>s.id) {
//		return 1;
//		}else if(this.marks < s.marks) {
//			return -1;
//		}else {
//			return 0;	
//		}
//	}

//	@Override
//	public int compareTo(Student s) {
//		if(this.id>s.id) {
//			return 1;
//		}else if(this.id<s.id) {
//			return -1;
//		}else {
//			return 0;
//			
//		}
//	}
//	
//	@Override
//	public int compareTo(Student s) {
//		String p = this.name.toLowerCase();
//		String q = s.name.toLowerCase();
//		
//		String a = p.toUpperCase();
//		String b = q.toUpperCase();
//		
//		return p.compareTo(q);
//		return p.compareToIgnoreCase(q);
//		return p.compareTo(q);
//	}
	
	
	
	
}
