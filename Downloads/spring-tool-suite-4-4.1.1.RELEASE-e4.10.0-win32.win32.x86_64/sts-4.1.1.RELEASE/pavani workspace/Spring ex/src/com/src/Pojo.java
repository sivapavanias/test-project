package com.src;


public class Pojo {
 private int cid;
 private String cname;
 private String address;
 Pojo()
 {
	 
 }
public int getCid() {
	this.cid=cid;
	this.cname=cname;
	this.address=address;
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Pojo [cid=" + cid + ", cname=" + cname + ", address=" + address + "]";
}

	}


