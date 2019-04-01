package com.Treemap;

import java.util.TreeMap;

//import com.comparatorex.Customer;

public class TreeMapEx {
	String name;
	String address;
	int id;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TreeMap tm=new TreeMap();
		tm.put("pk", "pen");
		tm.put("gk", "pecil");
		tm.put("hk", "book");
		tm.put("lk", "card");
		System.out.println(tm);
		//tm.comparator();
		System.out.println(tm.ceilingEntry("gk"));
		System.out.println(tm);
		System.out.println(tm.ceilingKey("pen"));
		System.out.println(tm);
		System.out.println(tm.containsKey("gk"));
		System.out.println(tm);
		System.out.println(tm.containsValue("pk"));*/
		TreeMap tm=new TreeMap();
		Customer c1=new Customer();
        System.out.println(tm.put("name", "pav"));
        System.out.println(tm.put("address", "hyd"));
        System.out.println(tm.put("dxcid", "sid"));
        System.out.println(tm);
        
        Customer c2=new Customer();
        System.out.println(tm.put("name", "sanju"));
        System.out.println(tm.put("address", "bang"));
        System.out.println(tm.put("dxcid", "pid"));
        System.out.println(tm);
        
		
		
	}

}
