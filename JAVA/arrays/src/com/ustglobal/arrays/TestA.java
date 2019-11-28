package com.ustglobal.arrays;

public class TestA {
public static void main(String[] args) {
	int[] nums = new int[5];
	nums[0] = 10;
	nums[1] = 20;
	nums[2] = 30;
	nums[3] = 40;
	nums[4] = 50;
	
	for(int i = 0 ; i<nums.length ; i++) {
		System.out.println(nums[i]);
	}
	
	System.out.println("****************************");
	
	for(int i : nums) {										//for each loop
		System.out.println(i);				
	}
	
	System.out.println("*****************************");
	
	boolean [] b = {true,false,false,true};
	for(int i=0;i<b.length ; i++) {
	System.out.println(b[i]);
	}
	
	System.out.println("******************************");
	
	char [] c = {'a','b','d','r'};
	for(int i=0;i<c.length ; i++) {
	System.out.println(c[i]);
	}
	
	System.out.println("******************************");
	
	byte [] b1 = {1,0,1,0};
	for(int i=0;i<b1.length ; i++) {
	System.out.println(b1[i]);
	}
	
	System.out.println("******************************");
	
	double [] d = {1.0,10.0,190,11.33};
	for(int i=0;i<d.length ; i++) {
	System.out.println(d[i]);
	}
	
	System.out.println("******************************");
	String [] s = {"ewvC","cewFC","WEFcfW"};
	for(String s1 : s) {
		System.out.println(s1);
		
	}
}
}

