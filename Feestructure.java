package com.menu;
import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Feestructure {
	private static String password;
	private static String username;
	static int age;
	static String name;
	static String address;
	static String useranme;
	static String email;
	static int contact;
	static String gender;

public static void main(String[] args) throws ClassNotFoundException, SQLException {
// TODO Auto-generated method stub
	
	Feestructure u[]=new Feestructure[100];
Scanner sc=new Scanner(System.in);
int index=0;
int choice=0;

System.out.println("users of the system");	
System.out.println("1.Admin");
System.out.println("2.Accountant");
System.out.println("3.Exit");
System.out.println("select your option :");
choice=sc.nextInt();
switch(choice)
{
case 1:
{
	do {

System.out.println("1.Add");
System.out.println("2.View");	
System.out.println("3.Edit");	
System.out.println("4.Delete");	
System.out.println("5.Exit");
int choice1=0;
choice1=sc.nextInt();
switch(choice1)
{
case 1:
{
	/*OutputStream fos=new FileOutputStream("add.txt");
	ObjectOutputStream obs=new ObjectOutputStream(fos);
	 ByteArrayOutputStream bos = new ByteArrayOutputStream();
	 byte[] bytes = str.getBytes();
	
	 fos.write(bytes);
	 fos.close();*/ 
System.out.println("adding Accountants");	
int l=index++;
Class.forName("com.mysql.jdbc.Driver");
//Class.forName("com.mysql.jdbc.Driver"); //loading a driver
Connection con=null;
Statement st=null;
PreparedStatement ps =null;
st=con.createStatement();
boolean b1=st.execute("create table customer1(name varchar(30),age number(10),address varchar(20),contact number(10),gender varchar(30),email varchar(20),username varchar(40),password varchar(40)");
		
try {
	/*Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pavani");*/ 
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dxcdb","root","root");
ps=con.prepareStatement("insert into customer1 values(?,?,?,?,?,?,?)");
for(int x=0;x<=l;x++) {
System.out.println("enter accountant details");
u[l]=new Feestructure();
System.out.println("enter name of user");
u[l].name=sc.next();
System.out.println("enter age of user");
u[l].age=sc.nextInt();
System.out.println("enter address of user");
u[l].address=sc.next();
System.out.println("enter contact");
u[l].contact=sc.nextInt();
System.out.println("enter gender");
u[l].gender=sc.next();
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
ps.setString(1, name);
ps.setInt(2, age);
ps.setString(3, address);
ps.setInt(4, contact);
ps.setString(4, gender);
ps.setString(5, email);
ps.setString(6, username);
ps.setString(7,password);
/*boolean j=ps.execute(name);
int jbos=ps.executeUpdate(name);
//int j1=ps.executeUpdate(age);
int j2=ps.executeUpdate(address);
//int j3=ps.executeUpdate(contact);
int j4=ps.executeUpdate(gender);
int j5=ps.executeUpdate(email);
int j6=ps.executeUpdate(username);
int j7=ps.executeUpdate(password);*/
int j=ps.executeUpdate();

System.out.println("Successful Registration");
break;
}
}
catch (SQLException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
finally
{
    try {
          ps.close();
          con.close();
    } catch (SQLException e) {
          // TODO Auto-generated cawtch block
          e.printStackTrace();
    }
}
break;
}


case 2:
{
	System.out.println("name is:"+name+ "age is:   "+age+"address is: "+address+"contact is "+contact+"gender is: "+gender+"email is: "+email +"username is: "+username+"password is: "+password);
	break;
}
case 3:
{
	System.out.println("Edit Accountants");	
	break;
}
case 4:
{
	System.out.println("Delete Accountants");
	break;
}
case 5:
 System.out.println("5.Exit");
}
}while(choice!=3);
}

/*int l=index++;
u[l]=new Feestructure();
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
*/
case 2:
	int choice2=0;
	choice2=sc.nextInt();
	switch(choice2)
	{
	case 1:
	{
	System.out.println("adding Student");	
	break;
	}
	case 2:
	{
		System.out.println("View Student");	
		break;
	}
	case 3:
	{
		System.out.println("Edit Student");	
		break;
	}
	case 4:
	{
		System.out.println("Delete Student");	
		break;
	}
	}
}}}
/*
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
*/
/*case 3:
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

}*/
	