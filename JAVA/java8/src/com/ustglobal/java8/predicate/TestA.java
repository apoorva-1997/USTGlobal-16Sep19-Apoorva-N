package com.ustglobal.java8.predicate;

import java.util.function.Predicate;

public class TestA {
public static void main(String[] args) {
	Predicate <Employee>  p = e ->{ 
		if(e.marks >= 35){
			return true;
		}else{
			return false;
		}
	};
	
	
	Employee e = new Employee(1,"A",90000);
	boolean res = p.test(e);
	System.out.println(res);
}
}
