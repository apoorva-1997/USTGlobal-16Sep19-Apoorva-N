package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Vector;

public class PriorityQueue1 {
public static void main(String[] args) {
	
	
	Vector v = new Vector();
	System.out.println(v.capacity());
	v.add(12);
	v.add(12);
	v.add(12);
	v.add(12);
	v.add(12);
	v.add(12);
	v.add(12);
	v.add(12);
	v.add(12);
	v.add(12);
	v.add(12);
	System.out.println(v.capacity());
	
	
	
	PriorityQueue<Number> p = new PriorityQueue<>();
	p.add(12);
	p.add(78);
	p.add(8);
	
	 
	System.out.println("*******************Iterator");
	Iterator<Number> i = p.iterator();
	while(i.hasNext()) {
		System.out.println(p.poll());
	}
	System.out.println("after pool "+p);
}
}
