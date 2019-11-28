package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByPin implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		return o1.pincode-(o2.pincode);
	}

}
