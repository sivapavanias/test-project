package com.assignment10;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListEx {
static int cid=10;
static String address="hyd";
static String name="sdf";
static double sal=1234;
static double phoneno=123456;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add(cid);
		l.add(name);
		l.add(address);
		l.add(sal);
		LinkedList l1=new LinkedList();
		System.out.println(l);
	    System.out.println(l.size());
	    System.out.println(l.isEmpty());
	    System.out.println(l.contains(sal));
	    System.out.println(l.indexOf(name));
	    System.out.println(l1.add(phoneno));
	    System.out.println(l.remove(1));
	    l.addAll(l1);
	    System.out.println(l);
	    l.addFirst(null);
	    System.out.println(l);
	    l.addLast(null);
	    System.out.println(l);
	    Object o[]=l.toArray();
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
