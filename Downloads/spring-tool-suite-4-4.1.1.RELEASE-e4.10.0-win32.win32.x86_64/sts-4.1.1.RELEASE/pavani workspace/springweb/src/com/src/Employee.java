package com.src;

public class Employee {

	 private int empid;
	 private String empname;
	 private String address;
	public int getCid() {
		return empid;
	}
		public String getCname() {
		return empname;
	}
		public String getAddress() {
		return address;
	}
	public Employee(int empid,String cname,String address)
	{
		this.empid=empid;
		this.empname=empname;
		this.address=address;
		}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", address=" + address + "]";
	}
	

}
