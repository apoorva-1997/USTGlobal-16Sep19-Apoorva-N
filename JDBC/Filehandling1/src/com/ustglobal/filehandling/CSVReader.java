package com.ustglobal.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVReader {
	public static void main(String[] args) {
		try(FileReader in = new FileReader("csv.txt");
	
		BufferedReader reader = new BufferedReader(in);)
			
		{
			while(reader.ready()) {						//if no while reads first line only
//			System.out.println(reader.readLine());
			String line =reader.readLine();
			String[] words = line.split(",");
		    System.out.println("id " +words[0]);
		    System.out.println("name " +words[1]);
		    System.out.println("salary " +words[2]);
		    System.out.println("gender " +words[3]);
		    System.out.println("****************************");
		}
			}catch(Exception e ) {
			e.printStackTrace();
		}
	}
}
