package com.ustglobal.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class TeacherArrTest {
	public static void main(String[] args) {

		ArrayList<TeacherArray> a = new ArrayList<TeacherArray>();
		
		TeacherArray t1 = new TeacherArray("A", 1000, "BSE");
		TeacherArray t2 = new TeacherArray("B", 2000, "MSE");
		TeacherArray t3 = new TeacherArray("C", 70000, "BE");
		
		a.add(t1);
		a.add(t2);
		a.add(t3);
		
		System.out.println("****For Loop****");
		for(int i=0;i<a.size();i++) {
			TeacherArray t = a.get(i);
			System.out.println(t);
//			System.out.println(t.name);
//			System.out.println(t.salary);
//			System.out.println(t.quali);
		}
		
		System.out.println("***ForEach Loop***");
		for(Object o : a) {
			System.out.println(o);
		}
		
		System.out.println("****Iterator****");
		Iterator t = a.iterator();
		while(t.hasNext()) {
			Object o1 = t.next();
			System.out.println(o1);
		}
		
		System.out.println("********ListIterator******");
		
		ListIterator li = a.listIterator();
		while(li.hasNext()) {
			Object o1 = li.next();
			System.out.println(o1);
		}

		System.out.println("********ListIterator hasprevious******");
		
		while(li.hasPrevious()) {
			Object o2 = li.previous();
			System.out.println(o2);
		}

		
	}
}
