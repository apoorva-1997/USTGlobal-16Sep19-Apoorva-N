package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop>{
	double price;
	String name;
	int ram;

	public Laptop(double price, String name, int ram) {
		super();
		this.price = price;
		this.name = name;
		this.ram = ram;
	}
	@Override
	public int compareTo(Laptop L) {
//		return this.ram - l2.ram;
		Integer  i  = this.ram;
		Integer j =L.ram;
		return i.compareTo(j);
		
	}
}

