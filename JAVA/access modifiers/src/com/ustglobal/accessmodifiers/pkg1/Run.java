package com.ustglobal.accessmodifiers.pkg1;

public class Run {
public static void main(String[] args) {
	Demo d = new Demo();
//	System.out.println(d.a);		//private cant be accessed
//	d.add();
	
	System.out.println(d.b);  		//default can be accessed
	d.sub();
	
	System.out.println(d.c);		//protected can be accessed
	d.mul();	
	
	System.out.println(d.name);		//public can be accesed
	d.div();
}
}
