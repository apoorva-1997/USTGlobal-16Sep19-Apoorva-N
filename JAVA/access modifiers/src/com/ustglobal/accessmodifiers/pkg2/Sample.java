package com.ustglobal.accessmodifiers.pkg2;

import com.ustglobal.accessmodifiers.pkg1.Demo;

public class Sample extends Demo{
public static void main(String[] args) {
	Demo d = new Demo();
//	System.out.println(d.a);		//private cant be accessed
//	d.add();
	
//	System.out.println(d.b);  		//default can be accessed
//	d.sub();
	
	Sample s = new Sample();
	System.out.println(s.c);		//protected can be accessed
	s.mul();	
	
	System.out.println(d.name);		//public can be accesed
	d.div();
}	
}

