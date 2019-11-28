package com.ustglobal.sorting.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet3 {
	public static void main(String[] args) {

		TreeSet<TreesetTest> h = new TreeSet<TreesetTest>();
		TreesetTest e1 = new TreesetTest(200000, "asc", 1);
		TreesetTest e2 = new TreesetTest(30000, "snc", 200);
		TreesetTest e3 = new TreesetTest(10000, "ska", 3);
		TreesetTest e4 = new TreesetTest(50000, "amn", 40);
		TreesetTest e41 = new TreesetTest(50000, "amn", 40);

		h.add(e1);
		h.add(e2);
		h.add(e3);
		h.add(e4);
		h.add(e41);

		System.out.println("**********************Iterator");
		Iterator<TreesetTest> i = h.iterator();
		while(i.hasNext())
		{
			TreesetTest e = i.next();
			System.out.println(e.id);
			System.out.println(e.salary);
			System.out.println(e.name);
		}
	}
}
