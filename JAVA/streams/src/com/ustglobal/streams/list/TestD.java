package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class TestD {
public static void main(String[] args) {
	
	ArrayList<Integer> marks = new ArrayList<>();
	marks.add(67);
	marks.add(34);
	marks.add(32);
	marks.add(22);
	marks.add(98);
	marks.add(77);
	marks.add(67);
	Comparator<Integer> cmp = (m1,m2) -> {
		if(m1>m2) {
			return 1;
		}else if (m1<m2) {
			return -1;
		}else {
			return 0;
		}
	};
	
	long noOfFailedStudents =  marks.stream().filter(i -> i < 40).count();
	System.out.println(noOfFailedStudents);
	
	
	System.out.println("***********************************");
	Integer i = marks.stream().min(cmp).get();
	System.out.println("min marks "+i);
	
	System.out.println("***********************************");
	Integer i1 = marks.stream().max(cmp).get();
	System.out.println("max marks "+i1);
	
	}
	}
