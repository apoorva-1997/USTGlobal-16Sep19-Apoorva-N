package com.ustglobal.sorting.list;

import java.util.Comparator;

public class CustomerComp implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.id - o2.id;
	}
	

}
