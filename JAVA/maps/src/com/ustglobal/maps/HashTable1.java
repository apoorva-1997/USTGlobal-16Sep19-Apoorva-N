package com.ustglobal.maps;

import java.util.Hashtable;

public class HashTable1 {
	public static void main(String[] args) {

		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		h.put(100, "Harry");
		h.put(501, "Hermoine");
		h.put(02, "Ron");
		h.put(10, "Snape");
		
		System.out.println("Data " +h);
		
		h.replace(101, "Voldamort");
		System.out.println("data " +h);
		
//		h.put(null,"dumbledoor"); 			//cant hold null for key
		
//		h.put(104,null);					//cant hold null for value
//		System.out.println("data " +h);
	}
}
