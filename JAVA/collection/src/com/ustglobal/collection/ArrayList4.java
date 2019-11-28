package com.ustglobal.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList4 {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add("apoo");
		a.add(10);
		a.add(true);
		a.add(45.0);

		ListIterator li = a.listIterator();
		System.out.println("*****has next**********");
		while(li.hasNext()) {
			Object ob = li.next();
			System.out.println(ob);
		}
		System.out.println("*******has previous******");
		while(li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o);
		}
	}
}
