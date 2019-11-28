package com.ustglobal.objectclass;

public class Car {
	int cost;
	String brand;
	String color;

	public Car(int cost, String brand, String color) {
		super();
		this.cost = cost;
		this.brand = brand;
		this.color = color;
	}

	@Override
	public int hashCode() {
		return cost;
	}

	@Override
	public String toString() {
		return "Car [cost=" + cost + ", brand=" + brand + ", color=" + color + "]";
	}
}

