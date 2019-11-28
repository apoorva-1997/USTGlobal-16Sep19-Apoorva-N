package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash2 {
	public static void main(String[] args) {
		LinkedHashSet<String> l = new LinkedHashSet<String>();
		l.add("ewcas");
		l.add("reasf");
		l.add("dcvca");
		l.add("dsvvcs");
		l.add("dvsfwa");

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
