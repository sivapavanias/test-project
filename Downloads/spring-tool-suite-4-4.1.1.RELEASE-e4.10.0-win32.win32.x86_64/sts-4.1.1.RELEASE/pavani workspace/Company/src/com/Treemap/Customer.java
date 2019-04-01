package com.Treemap;
//import com.comparatorex.Customer;

class Customer implements Comparable
{
       int id;
       String name;
       String address;
       
	public Customer(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return " this.id +" "+this.name+" "+this.address";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		String s=(String)o1;
		String s=(String)o2;
		return true;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
       
       
             
       }
       
       

