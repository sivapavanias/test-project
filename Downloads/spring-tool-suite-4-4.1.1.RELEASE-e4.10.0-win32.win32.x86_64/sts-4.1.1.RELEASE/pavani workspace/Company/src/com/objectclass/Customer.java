package com.objectclass;

public class Customer {
int cid;
String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.cid+""+this.name;
			
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		c.cid=this.cid;
		c.name=this.name;
		return c;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Customer ct=(customer)obj;
		if(ct.cid==this.cid&&ct.name==this.name)
		return super.equals(obj);
	}

}
