package com.ustglobal.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array2 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(1);
		a.add("ads");
		a.add(true);
		a.add(20.9);
		a.add(null);
		
		Iterator i = a.iterator();
		Object o = i.next();
		System.out.println("obj "+o);
		
		Object o1 = i.next();
		System.out.println("obj1 "+o1);
		
		Object o2 = i.next();
		System.out.println("obj2 "+o2);
		
		
		Object o3 = i.next();
		System.out.println("obj3 "+o3);
		
		Object o4 = i.next();
		System.out.println("obj4 "+o4);
		
		boolean b = i.hasNext();
		System.out.println(b);
//		Object o5 = i.next();
//		System.out.println("obj5 "+o5);
//		
		System.out.println("*****using forloop******");
		
		for(int j=0; j<a.size(); j++) {
			Object on = a.get(j);
			System.out.println(on);
		}
		
		System.out.println("******using Iterator******");
		
		Iterator i1 = a.iterator();
		while(i1.hasNext()) {
			Object oa = i1.next();
			System.out.println(oa);
	}
}
}