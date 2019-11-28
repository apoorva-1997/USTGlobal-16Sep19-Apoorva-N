package com.ustglobal.immutableclass;

public class Test {
	public static void main(String[] args) {
		MyString m = new MyString(12,"ajwbh");
		System.out.println(m.getName());
		System.out.println(m.getRolllno());
		System.out.println(m);
		
		MyString m1 = m.changeContent(13,"awe");
		System.out.println(m.getName());
		System.out.println(m.getRolllno());
		System.out.println(m);
	}
}
