package com.excp;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FindIOException  {
	public static void main(String[] args) throws IOException {
		
	
	File f  = new File("C:\\Users\\Admin\\Desktop\\wish.txt") ;
	FileReader fr = new FileReader(f) ;
	try {
		int temp = 0 ;
		while((temp=fr.read())!=-1) {
			System.out.println((char) temp);
		}
	}
	catch (Exception e) {
		System.out.println(e);
	}

}
}