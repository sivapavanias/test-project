package com.collectionspkg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList al=new ArrayList();
    System.out.println(al.size());
    System.out.println(al.isEmpty());
    al.add(10);
    al.add("siva pavani");
    System.out.println(al);
    System.out.println(al.size());
    System.out.println(al.isEmpty());
    System.out.println(al.contains(al));
    
    Object o[]=al.toArray();
    Integer i=(Integer)o[0];
    System.out.println(i);
    String st=(String)o[1];
    System.out.println(st);
     ArrayList al1=new ArrayList();
     al1.add(20);
     al1.add(30);
     al1.addAll(al);
     System.out.println(al1);
     //al1.removeAll(al);
     System.out.println(al);
     System.out.println(al1);
    List al2=al.subList(1, 2);
    System.out.println(al2);
    /* Iterator it=al.iterator();
     while(it.hasNext())
     {
    	 Integer in=(Integer) it.next();
    	 System.out.println(in);
    	 if(in%15==0)
    	 {
    		it.remove(); 
    	 }
    	System.out.println(al);
     }*/
    LinkedList ll=new LinkedList();
    ll.add(al);
    ll.add(al1);
    ll.add(al2);
    ll.add(null);
    System.out.println(ll);
    System.out.println(ll.getFirst());
    System.out.println(ll.getLast());
  System.out.println(ll.descendingIterator());
  
   // System.out.println(ll.node(1));
  Vector v=new Vector();
  v.addElement(10);
  v.addElement(20);
  v.addElement(30);
  v.addElement(40);
  v.add(70);
  System.out.println(v);
  //System.out.println(v.capacity());
  
    
    	}
}
