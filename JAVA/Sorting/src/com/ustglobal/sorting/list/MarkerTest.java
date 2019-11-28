package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MarkerTest {
	public static void main(String[] args) {

		ArrayList<Marker> a = new ArrayList<Marker>();

		a.add(new Marker("blue",10));
		a.add(new Marker("red",40));
		a.add(new Marker("black",80));
		a.add(new Marker("orange",20));

		
		display(a);
		MarkerSortprice m = new MarkerSortprice();
		MarkerSortColor c = new MarkerSortColor();
		Collections.sort(a,c);
//		Collections.sort(a,m);
		System.out.println("***********after sorting********");
		display(a);
		System.out.println("***********");
		display(a);
		
	}

	static void display(ArrayList<Marker> a) {
		Iterator <Marker>i = a.iterator();
		while(i.hasNext()) {
			Marker m1 = i.next();
			System.out.println(m1.price);
			System.out.println(m1.color);
		}
	}
}
