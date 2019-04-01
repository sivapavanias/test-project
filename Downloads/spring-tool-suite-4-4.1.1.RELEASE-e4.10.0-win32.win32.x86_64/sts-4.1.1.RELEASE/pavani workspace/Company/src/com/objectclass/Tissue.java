package com.objectclass;
import java.util.Scanner;

import com.loginpage.Mainclass;
public class Tissue {
int cid;
public String name;
	public static void main(String[] args) {
		Tissue c[]=new Tissue[3];
		c[0].cid=34;
		c[0].name="pavani";
		
		c[1].cid=543;
		c[2].name="ashu";
		
		c[1].cid=54;
		c[2].name="bujji";
		
		for(Tissue ch:c)
		{
			System.out.println(ch);
		}
	}
}


