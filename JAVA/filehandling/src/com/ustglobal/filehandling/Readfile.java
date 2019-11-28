package com.ustglobal.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class Readfile {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\91944\\Desktop\\Text.txt";
		FileReader reader = null;
		
		try {
			reader = new FileReader(path);
			int i;
			while((i=reader.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
