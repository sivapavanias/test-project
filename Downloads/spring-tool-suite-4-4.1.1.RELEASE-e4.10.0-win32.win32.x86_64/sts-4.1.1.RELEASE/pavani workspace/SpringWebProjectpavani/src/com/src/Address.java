package com.src;

public class Address {
 private int hno;
 private String street;
 private String hname;
public int getHno() {
	return hno;
}
public String getStreet() {
	return street;
}
public String getHname() {
	return hname;
}
@Override
public String toString() {
	return "Address [hno=" + hno + ", street=" + street + ", hname=" + hname + "]";
}
 
}
