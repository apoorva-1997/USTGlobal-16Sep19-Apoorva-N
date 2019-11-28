package com.ustglobal.abstraction1;

public class Test {
public static void main(String[] args) {
	 Browser b = new Browser();
	 
	 Google g = new Gmail();
	 b.open(g);
	 
	 Google gd = new GoogleDrive();
	 b.open(gd);
}
}
