package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class CustomerTest {
public static void main(String[] args) {
	CustomerComp c = new CustomerComp();
	TreeSet<Customer> t = new TreeSet<Customer>(c);
	
	Customer c1 = new Customer("aku", 34, 30000);
	Customer c2 = new Customer("suer", 87, 90000);
	Customer c3 = new Customer("aru", 22, 10000);
	
	t.add(c1);
	t.add(c2);
	t.add(c3);
	
	System.out.println("*******************iterator");

	Iterator<Customer> i = t.iterator();
	while(i.hasNext()) {
		Customer b = i.next();
		System.out.println("name is "+b.name);
		System.out.println("salary code " +b.salary);
		System.out.println("id is "+b.id);
	}

}
}
