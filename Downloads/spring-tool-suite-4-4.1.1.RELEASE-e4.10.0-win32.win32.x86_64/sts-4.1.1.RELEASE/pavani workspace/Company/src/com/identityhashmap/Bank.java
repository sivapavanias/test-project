package com.identityhashmap;
import java.util.Scanner;

import com.bank.Bankcust;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Bank {
static int customer;
int mobilenum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*IdentityHashMap ihm=new IdentityHashMap();
		ihm.put("siva", "pavani");
		ihm.put(new StringBuffer("kalli"),"aswani");
		ihm.put("kalli", "padma");
		System.out.println(ihm);*/
		HashMap hm=new HashMap();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customer details "+customer);
		customer=sc.nextInt();
		Bankcust c1=new Bankcust("cust1","8688");
		Bankcust c2=new Bankcust("cust2","32422");
		hm.put(c1, "mobile");
		System.out.println(hm);
		

	}

}
