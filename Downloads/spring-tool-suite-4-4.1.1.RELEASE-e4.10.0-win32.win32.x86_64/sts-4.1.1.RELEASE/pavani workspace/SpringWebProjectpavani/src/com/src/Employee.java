package com.src;

import java.util.List;

public class Employee {
	private int eid;
	private String name;
	//private Address address;
	private List<Address> address;
	/*public Employee(int eid, String name, Address address) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
	}*/
	/*public Address getAddress() {
		return address;
	}*/
	
	public int getEid() {
		return eid;
	}
	public List<Address> getAddress() {
		return address;
	}
	public Employee(int eid, String name, List<Address> address) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	
	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	public Employee(int eid) {
		super();
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	
}
