package com.comparatorex;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator
{

       
       @Override
       public int compare(Object o1, Object o2) {
             // TODO Auto-generated method stub
             Customer i=(Customer)o1;
             Customer j=(Customer)o2;
             
             if(i.name.compareTo(j.name)>0)
             {
                    return 1;
             }
             else
             return -1;
       }
       
}
public class TreeSetEx {

       public static void main(String[] args) {
             // TODO Auto-generated method stub
             
             TreeSet ts = new TreeSet(new MyComparator());
             Customer c1=new Customer();
             c1.id=420;
             c1.name="ravi";
             c1.address="kphb";
             
             Customer c2=new Customer();
             c2.id=840;
             c2.name="raghu";
             c2.address="jntu";
             ts.add(c1);
             ts.add(c2);
             System.out.println(ts);
             /*System.out.println(ts.floor(30));
             System.out.println(ts.lower(30));
             System.out.println(ts.higher(30));
             System.out.println(ts.ceiling(30));
             System.out.println(ts.pollFirst());
             System.out.println(ts);
             System.out.println(ts.pollLast());
             System.out.println(ts);
             System.out.println(ts.headSet(6));//4,5
             System.out.println(ts.tailSet(10));//10,30,40
             System.out.println(ts.subSet(5, 10));//5,6
             System.out.println(ts.headSet(6,true));//4,5,6
             System.out.println(ts.tailSet(10,false));//30,40
             System.out.println(ts.subSet(5,false, 10,true));//6,10*/
       }
}

