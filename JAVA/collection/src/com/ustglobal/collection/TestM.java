package com.ustglobal.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<>();
		a.add("eqffe");
		a.add("wfqe");
		a.add("wmmgvo");
		a.add("dsvf");

		System.out.println("before sort -----> "+a);
		Collections.sort(a);
		System.out.println("after sort -----> "+a);
	}
}
