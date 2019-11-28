package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen>{
double cost;
String name;

public Pen(double cost, String name) {
	super();
	this.cost = cost;
	this.name = name;
}

@Override
public int compareTo(Pen p) {
	
		if(this.cost>p.cost) {
			return -1;
		}else if(this.cost<p.cost) {
			return 1;
		}else {
			return 0;
			
		}
	}

}
