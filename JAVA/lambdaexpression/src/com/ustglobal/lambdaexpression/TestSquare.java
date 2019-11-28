package com.ustglobal.lambdaexpression;

public class TestSquare {
public static void main(String[] args) {
	SquareInterface sq = x -> x*x;
	int val = sq.square(4);
	System.out.println("Square is "+val);
}
}
