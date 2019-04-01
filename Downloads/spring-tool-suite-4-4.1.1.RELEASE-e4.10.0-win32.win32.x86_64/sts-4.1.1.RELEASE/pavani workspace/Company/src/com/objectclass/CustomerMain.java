package com.objectclass;
public class CustomerMain {

public static void main(String[] args) throws CloneNotSupportedException {
// Customer c[]=new Customer[3];
// 
// c[0]=new Customer();
// c[0].cid=345;
// c[0].name="aruna";
// 
// c[1]=new Customer();
// c[1].cid=543;
// c[1].name="subhadra";
// 
// c[2]=new Customer();
// c[2].cid=345;
// c[2].name="kaveri";
// 
// 
// for(Customer ch:c)
// {
// System.out.println(ch);
// }



// Customer rajini=new Customer();
// 
// rajini.cid=9999;
// rajini.name="chiti";
// 
// Customer model1=rajini;
// System.out.println(rajini);
// System.out.println(model1);
// 
// rajini.name="robo";
// System.out.println(rajini);
// System.out.println(model1);


// Customer rajini=new Customer();
// 
// rajini.cid=9999;
// rajini.name="chiti"; 
// 
// Customer robo=(Customer) rajini.clone();
// System.out.println(rajini);
// System.out.println(robo);
// robo.name="updated chiti";
// System.out.println(rajini);
// System.out.println(robo);
// 

Customer c[]=new Customer[3];

c[0]=new Customer();
c[0].cid=345;
c[0].name="aruna";

c[1]=new Customer();
c[1].cid=543;
c[1].name="subhadra";

c[2]=new Customer();
c[2].cid=345;
c[2].name="kaveri";


Customer cu=new Customer();
cu.cid=543;
cu.name="subhadra";

for(Customer ch:c)
{
System.out.println(ch.equals(cu));
}


String str="shiva";
String str1="shiva";

str.equals(str1);
Customer c1 = new Customer();
c1.cid=420;
c1.name="ROBO";

Customer c2 = new Customer();
c2.cid=420;
c2.name="ROBO";
System.out.println(c1.equals(c2));


}

}