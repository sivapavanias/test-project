package com.assignment10;

import java.util.ArrayList;

public class Assign {
static int cid=10;
static String address="hyd";
static String name="sdf";
static double sal=1234;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(cid);
		al.add(name);
		al.add(address);
		al.add(sal);
		System.out.println(al);
	    System.out.println(al.size());
	    System.out.println(al.isEmpty());
	    System.out.println(al.contains(sal));
	    System.out.println(al.indexOf(name));
	    System.out.println(al.remove(1));
	    System.out.println(al);
	    Object o[]=al.toArray();
	    Integer i=(Integer)o[0];
	    System.out.println(i);
	    String st=(String)o[1];
	    System.out.println(st);
	    String st1=(String)o[2];
	    System.out.println(st1);
	    Integer i1=(Integer)o[3];
	    System.out.println(i1);
	   
	    
		

	}

}
