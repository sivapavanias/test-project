package com.stack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Stack;
import java.util.TreeSet;

public class StackEx {
/*static int id;
String name;
String address;

	@Override
public String toString() {
	return "StackEx [id=" + id + ", name=" + name + ", address=" + address + "]";
}
	

	@Override
	public int hashCode() {
		
		return this.id;
	}


	@Override
	public  boolean equals(Object obj) {
		StackEx c=(StackEx)obj;
		if(c1.id=this.id) {
			return true;
		}
		else {
			return false;
		}
		
	}
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Stack s=new Stack();
		s.push(10);
		s.push("20");
		s.push("30");
		s.push("60");
		
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.search("20"));
		System.out.println(s.empty());*/
		/*LinkedHashSet hs=new LinkedHashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		System.out.println(hs.add(10));
		System.out.println(hs);*/
		
		/*StackEx c1 = new StackEx();
		c1.id=420;
		c1.name="pav";
		c1.address="hyd";
		StackEx c2 = new StackEx();
		c2.id=420;
		c2.name="pav";
		c2.address="hyd";
		System.out.println(c1);
		System.out.println(c2);
		
		*/
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(30);
		ts.add(40);
		ts.add(4);
		ts.add(5);
		ts.add(6);
		System.out.println(ts);
		//ts.lower(5);
		System.out.println(ts.lower(6));
		System.out.println(ts.lower(5));
		System.out.println(ts.higher(6));
		System.out.println(ts.ceiling(5));
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
		System.out.println(ts.subSet(5, 10));
		ts.add(56);
		ts.add(66);
		System.out.println(ts);
		System.out.println(ts.headSet(10));
		System.out.println(ts.tailSet(30));
		System.out.println(ts.floor(10));
        		

	}

}
