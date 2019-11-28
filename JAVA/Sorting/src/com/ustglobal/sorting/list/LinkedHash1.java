package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash1 {
	public static void main(String[] args) {
		LinkedHashSet l = new LinkedHashSet();
		l.add(213);
		l.add("reasf");
		l.add(32.3);
		l.add(null);
		l.add(true);

		System.out.println("*********************for looop");
		for(Object o : l) {
			System.out.println(o);
		}

		System.out.println("*********************Iterator");
		Iterator i = l.iterator();
		while(i.hasNext()) {
			Object o1 = i.next();
			System.out.println(o1);
		}
	}
}
