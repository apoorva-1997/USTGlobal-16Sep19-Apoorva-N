package com.ustglobal.typecasting;

public class Marker extends ReferenceCasting{
	double size;
	void color() {
		System.out.println("color method");
	}
	void write() {
		System.out.println("write 1 method");
	}
	public static void main(String[] args) {
//		ReferenceCasting r = new ReferenceCasting();
//		System.out.println(r.cost);
//		r.write();
//		Marker m = new Marker();
//		System.out.println(m.size);
//		m.color();
		ReferenceCasting r1 = new Marker();				//Upcasting
		System.out.println(r1.cost);
		r1.write( );
		Marker m1 = (Marker) r1;						//Downcasting
		m1.color();
		m1.write();
		System.out.println(m1.size);
	}
}