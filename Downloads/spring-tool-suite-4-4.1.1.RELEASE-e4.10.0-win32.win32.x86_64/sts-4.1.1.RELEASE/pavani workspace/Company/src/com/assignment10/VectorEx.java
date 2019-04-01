package com.assignment10;

import java.util.Vector;

public class VectorEx{
static int cid=10;
static String address="hyd";
static String name="sdf";
static double sal=1234;
static String uname="wertyu";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add(cid);
		v.add(name);
		v.add(address);
		v.add(sal);
		System.out.println(v);
	    System.out.println(v.size());
	    System.out.println(v.isEmpty());
	    System.out.println(v.contains(sal));
	    System.out.println(v.indexOf(name));
	    System.out.println(v.remove(1));
	    System.out.println(v.firstElement());
	    System.out.println(v.lastElement());
	    Vector v1=new Vector();
	    v1.addElement(uname);
	    System.out.println(v1);
	    System.out.println(v.get(0));


	   v1.setElementAt(v1, 0);
	    System.out.println(v1);

	    Object o[]=v.toArray();
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
