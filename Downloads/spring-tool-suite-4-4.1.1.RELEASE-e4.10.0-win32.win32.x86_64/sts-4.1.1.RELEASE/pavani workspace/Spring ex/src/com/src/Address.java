package com.src;

public class Address {
private int hno;
private String hname;
private String cityname;

@Override
public String toString() {
	return "Address [hno=" + hno + ", hname=" + hname + ", cityname=" + cityname + "]";
}
public int getHno() {
	return hno;
}
public void setHno(int hno) {
	this.hno = hno;
}
public String getHname() {
	return hname;
}
public void setHname(String hname) {
	this.hname = hname;
}
public String getCityname() {
	return cityname;
}
public void setCityname(String cityname) {
	this.cityname = cityname;
}


}
