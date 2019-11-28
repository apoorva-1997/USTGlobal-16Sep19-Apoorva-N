package com.ustglobal.hasarelation.weak;

public class TestA {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.name);
		c.move();
		System.out.println(c.m.songname);
		c.m.on(); 									// Has-A Relation
	}
}
