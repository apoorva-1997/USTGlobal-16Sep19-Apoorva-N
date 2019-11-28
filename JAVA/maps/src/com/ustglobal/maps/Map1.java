package com.ustglobal.maps;

import java.util.HashMap;

public class Map1 {
public static void main(String[] args) {
	
	HashMap h = new HashMap();
	h.put("A",1245);
	h.put("B",12133);
	h.put("C",93093);
	
	System.out.println("data " +h);
	
	h.put("D",8757);
	h.put("D",8757);			//Duplicates key  are not allowed
	
	h.put("E",8757);			//Duplicates value  are allowed
	
	h.put(null, 84989);			//null allowed
	
	h.put(null, 78676);			//only one null allowed
	System.out.println("after adding " +h);
	
	Object num = h.get("D");
	System.out.println("Value " +num);
	
	Object num1 = h.get("M");
	System.out.println("Value " +num1);
	
	Object num2 = h.remove("D");
	System.out.println("Value " +num2);
	System.out.println("after remove " +h);
}
}
