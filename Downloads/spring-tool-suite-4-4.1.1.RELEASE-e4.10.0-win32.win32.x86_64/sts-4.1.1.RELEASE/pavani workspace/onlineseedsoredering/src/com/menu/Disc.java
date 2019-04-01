package com.menu;
import java.util.Scanner;
public class Disc {
	private static String password;
	private static String username;
	int age;
	String name;
	String address;
	String useranme;
	String email;

public static void main(String[] args) {
// TODO Auto-generated method stub
	
	Disc u[]=new Disc[100];
Scanner sc=new Scanner(System.in);
int index=0;
int choice=0;
do {
System.out.println("1.Register");
System.out.println("2.login");
System.out.println("3.display");
System.out.println("4.Register");
System.out.println("5.Exit");
System.out.println("select your option :");
choice=sc.nextInt();
switch(choice)
{
case 1:
{
int l=index++;
u[l]=new Disc();
System.out.println("enter name of user");
u[l].name=sc.next();
System.out.println("enter age of user");
u[l].age=sc.nextInt();
System.out.println("enter address of user");
u[l].address=sc.next();
try {
System.out.println("enter email adress");
u[1].email=sc.next();
}catch(NullPointerException e)
{
	System.out.println(e);
}
System.out.println("enter username of user");
String username=sc.next();
String encoded="";
char c[]=username.toCharArray();
for(int ch:c)
{
encoded=encoded+ch;

}
u[l].username=encoded;
System.out.println("enter password of user");
String password=sc.next();
c=password.toCharArray();
String pwd="";

for(int ch:c)
{
pwd=pwd+ch;

}
u[l].password=pwd;
System.out.println("Successful Registration");
break;
}

case 2:
{
System.out.println("enter username and password");
String uname=sc.next();
String pwd=sc.next();
String enc="";
String p="";
char c[]=uname.toCharArray();

for(int i:c)
{
enc=enc+i;
}
c=pwd.toCharArray();
for(int i:c)
{
p=p+i;
}

for(int i=0;i<index;i++)
{
Object camera = 0;
if(u[i].username.equals(enc) && u[i].password.equals(camera))
{
System.out.println("welcomelllllllllllllllllllllllll");
break;
}
else
{
System.out.println("get Lost or register");
}
}
break;

}
case 3:
{
for(int i=0;i<index;i++)
{
System.out.println(u[i].name+" - "+u[i].age+" - "+u[i].address+" - "+u[i].username+" - "+u[i].password);
}
break;
}
}

}while(choice!=4);

}

}