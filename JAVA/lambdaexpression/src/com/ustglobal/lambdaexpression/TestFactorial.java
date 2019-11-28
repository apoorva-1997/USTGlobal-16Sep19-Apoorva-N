package com.ustglobal.lambdaexpression;

public interface TestFactorial {
public static void main(String[] args) {
	FactorialInterface f = (n) ->{
		int fact = 1;
		for(int i = 2; i<=n;i++)
		{
			fact = fact*i;
			}
		return fact;
};
int facttotal  = f.factorial(3);
System.out.println(facttotal);
}
}