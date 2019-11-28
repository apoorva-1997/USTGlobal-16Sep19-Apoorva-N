package com.ustglobal.sorting.list;

import java.util.Comparator;

public class MarkerSortColor implements Comparator<Marker>{

	@Override
	public int compare(Marker o1, Marker o2) {
		String s = o1.color;
		String s2 = o2.color;
		return s.compareTo(s2);

	}

}
