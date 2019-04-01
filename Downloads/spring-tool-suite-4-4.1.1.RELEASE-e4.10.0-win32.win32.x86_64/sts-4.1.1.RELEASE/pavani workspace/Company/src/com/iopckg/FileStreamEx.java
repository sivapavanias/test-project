package com.iopckg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
     try {
		FileOutputStream pos=new FileOutputStream("feb24.txt");
		String str="hihellowelcome";
		byte b[]=str.getBytes();
		for(byte by:b)
		{
			System.out.println(by);
		}
		pos.write(b);
		pos.close();
		System.out.println("written to file");
		FileInputStream fis=new FileInputStream("sample.txt");
		int i=0;
		while((i=fis.read())!=-1) {
			System.out.println((char)i);
			
		}
		pos.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
     
     
	}

}
