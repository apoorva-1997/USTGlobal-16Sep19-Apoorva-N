package com.ustglobal.arrays;

public class TestB {
public static void main(String[] args) {
	
	int[] nums = {10,20,30,40};
//	System.out.println(nums[10]); 		//arrayoutofboundsexception
	
	receive(nums);
	int[] values = getarray();
	for(int val : values) {
		System.out.println(val);
	}
	
	}

 static void receive(int[] numbers) {
	 for(int num : numbers) {
		 System.out.println(num);
}
}
 static int[] getarray() {
	 int[] values = {20,303,40,50};
	 return values;
 }
 
 static String[] recieve(String[] str) {
	 String[] str1 = {"awef","weVF","ewvd","vav"};
	 return str1;
 }

}
