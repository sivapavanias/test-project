package com.bank;

public class Bankcust implements Comparable {

	static int customer;
	int mobilenum;
	public Bankcust(int mobilenum) {
		super();
		this.mobilenum = mobilenum;
	}
	public Bankcust(String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return this.mobilenum;
	}
	@Override
	public String toString() {
		return "Bankcust [mobilenum=" + mobilenum + "]";
	}
	
		
		  

	}


