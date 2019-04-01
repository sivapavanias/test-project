package com.exp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
FileOutputStream fos=new FileOutputStream("student.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);
Student st=new Student(32,"hi","venu");
Student st1=new Student(32,"hello","gopal");
oos.writeObject(st);
oos.writeObject(st1);
oos.close();
FileInputStream fis = new FileInputStream("student.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
//Student s=null;
s=(Studet) ois.readObject();
System.out.println(s);


	}

}
