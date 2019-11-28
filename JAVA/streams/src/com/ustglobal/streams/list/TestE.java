package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {
	public static void main(String[] args) {
		

		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(67);
		marks.add(34);
		marks.add(32);
		marks.add(22);
		marks.add(98);
		marks.add(77);
		marks.add(67);
		
		List<Integer> l = marks.stream().sorted().collect(Collectors.toList());
		Iterator<Integer> i = l.iterator();
		while(i.hasNext()) {
			Integer i1 = i.next();
			System.out.println(i1);
		}
	}

}

 