package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LaptopTest {
	public static void main(String[] args) {
		LinkedList<Laptop> l = new LinkedList<Laptop>();
		Laptop l1 = new Laptop(20000, "Dell", 12);
		Laptop l2 = new Laptop(80000, "hp", 6);
		Laptop l3 = new Laptop(30000, "Lenovo", 8);
		Laptop l4 = new Laptop(10000, "Acer", 4);

		l.add(l1);
		l.add(l2);
		l.add(l3);
		l.add(l4);
		l.add(new Laptop(2000,"Asus",2));

//		displayLaptopDetails(l);
		Collections.sort(l);
		displayLaptopDetails(l);
	}
	static void displayLaptopDetails(LinkedList<Laptop> l) {
		Iterator <Laptop>i = l.iterator();
		while(i.hasNext()) {
			Laptop l1 = i.next();
			System.out.println(l1.name);
			System.out.println(l1.price);
			System.out.println(l1.ram);
		}
	}

}
