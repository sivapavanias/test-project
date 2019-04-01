package com.weakhashmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class WeakHashMapEx {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
/*WeakHashMap whm=new WeakHashMap();

Demo c1=new Demo("hi");
Demo c2=new Demo("hello");
Demo c3=new Demo("java");
Demo c4=new Demo("cpp");




whm.put(c1, "shahu");
whm.put(c2, "shahu");
whm.put(c3, "shahu");
whm.put(c4, "shahu");


System.out.println(whm);

c1=null;
c2=null;
c3=null;
c4=null;
System.gc();
Thread.sleep(10000);
System.out.println(whm);
}

}

class HashMapEx1 {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
HashMap whm=new HashMap();

Demo c1=new Demo("hi");
Demo c2=new Demo("hello");
Demo c3=new Demo("java");
Demo c4=new Demo("cpp");




whm.put(c1, "shahu");
whm.put(c2, "shahu");
whm.put(c3, "shahu");
whm.put(c4, "shahu");


System.out.println(whm);

c1=null;
c2=null;
c3=null;
c4=null;
System.gc();
Thread.sleep(10000);
System.out.println(whm);*/
	
	/*PriorityQueue pq=new PriorityQueue();
	pq.add(10);
	pq.add(5);
	pq.add(2);
	pq.add(20);
	pq.add(60);
	System.out.println(pq);
	pq.poll();
	System.out.println(pq);
	pq.poll();
	System.out.println();*/
	/*
    ArrayBlockingQueue abq=new ArrayBlockingQueue(30);
    abq.add(10);
    abq.add(20);
    abq.add(30);
    abq.add(60);
    abq.add(80);
    System.out.println(abq);
    //abq.poll(3000,"seconds");
    System.out.println(abq);
    ArrayList al=new ArrayList();
    abq.drainTo(al);
    System.out.println(al);
    System.out.println(abq);*/
	LinkedBlockingQueue lbq=new LinkedBlockingQueue();
	lbq.add(90);
	lbq.add(90);
	
	




}

}