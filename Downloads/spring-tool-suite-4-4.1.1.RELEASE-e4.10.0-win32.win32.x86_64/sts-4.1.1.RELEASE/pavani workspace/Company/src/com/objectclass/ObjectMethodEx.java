package com.objectclass;
public class ObjectMethodEx {

public static void main(String[] args) throws CloneNotSupportedException {
// TODO Auto-generated method stub
User u=new User();
u.age=17;
u.userid=9;

System.out.println(u.getClass());
System.out.println(System.out.getClass());
System.out.println(u.hashCode());
User u1=new User();
u1.age=21;
u1.userid=7;
System.out.println(u1.hashCode());
u=u1;
System.out.println(u.hashCode());
System.out.println(u1.hashCode());

u.age=90;
System.out.println(u1.age);

User u2=(User) u.clone();
System.out.println(u2.age);
u2.age=23;
System.out.println(u.age);

System.out.println(u2);





}

}
 

