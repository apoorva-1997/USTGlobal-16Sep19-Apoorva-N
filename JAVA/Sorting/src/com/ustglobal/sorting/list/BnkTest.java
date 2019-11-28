package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class BnkTest {
public static void main(String[] args) {
	BankSortbyname sb =new  BankSortbyname();
	SortByPin sp = new SortByPin();
	Sortbymicr sm = new Sortbymicr();
	TreeSet<Bank> t = new TreeSet<Bank>(sm );
	Bank b1 = new Bank("SBI", 582201, 468414) ;
	Bank b2 = new Bank("Canara", 548555, 455152);
	Bank b3 = new Bank("AXIS", 580061, 4665856);
	Bank b4 = new Bank("CIFT", 545865, 465966);
	Bank b41 = new Bank("CIFT", 545865, 465966);  //duplicates are not allowed
	
	t.add(b1);
	t.add(b2);
	t.add(b3);
	t.add(b4);
	t.add(b41);
	
	
	System.out.println("*******************iterator");

	Iterator<Bank> i = t.iterator();
	while(i.hasNext()) {
		Bank b = i.next();
		System.out.println(b.name);
		System.out.println("pin code" +b.pincode);
		System.out.println("micr is "+b.micr);
	}

}
}
