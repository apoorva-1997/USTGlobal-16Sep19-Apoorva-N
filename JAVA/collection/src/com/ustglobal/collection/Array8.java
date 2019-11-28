package com.ustglobal.collection;

import java.util.ArrayList;
import java.util.List;

public class Array8 {
public static void main(String[] args) {
	ArrayList<Double> a = new ArrayList<Double>();
	a.add(34.5);
	a.add(4.4);
	a.add(34.0);
	a.add(344.43);
	a.add(null);   //list allow null
	a.add(34.5);   //list allow duplicates
	
	System.out.println(a);
	a.add(2,45.2);
	System.out.println("add after 2nd index " +a);
	
	a.remove(0);
	System.out.println("after removing " +a);
	
	a.remove(null);
	System.out.println("after removing  null " +a);
	
	
	Double val = a.get(4);
	System.out.println("obj at 4th index " +val);
	
	a.set(2, 2.2);
	System.out.println("after replacing 2nd index " +a);
	
	a.clear();
	System.out.println("after clear method " +a);
	
	a.contains(55.5);
	System.out.println("after contains method " +a);
	
	System.out.println("*******************************");
	
	List<Double> al = new ArrayList<>();
	al.add(12.5);
	al.add(12.324);
	al.add(33.4);
	
	a.addAll(al);
	System.out.println("after adding ala " +a);
	
	boolean contain = al.containsAll(al);
	System.out.println("contains all of al " +contain);
	
	boolean res = al.removeAll(al);
	System.out.println("removed all from al " +res);

}

}
