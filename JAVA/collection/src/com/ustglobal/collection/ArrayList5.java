package com.ustglobal.collection;

import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("amooooooogha");
		Object o = a.get(0);
		System.out.println(o);		

		String name = (String)o;			//to access string (child clss)members downcast
		name = name.toUpperCase();
		System.out.println(name);
	}
}