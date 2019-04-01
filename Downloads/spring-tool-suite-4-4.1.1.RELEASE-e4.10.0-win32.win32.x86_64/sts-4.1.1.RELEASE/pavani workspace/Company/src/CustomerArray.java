import java.util.Scanner;
public class CustomerArray {
       static Scanner sc=new Scanner(System.in);
       public static void main(String[] args) {
             // TODO Auto-generated method stub
             Customer cu[]=new Customer[3];
             CustomerArray ca=new CustomerArray();
             for(int i=0;i<cu.length;i++) {
                    cu[i]=ca.acceptingCustomer();
             }
             ca.show(cu);
       }
       Customer acceptingCustomer() {
             Customer c=new Customer();
             System.out.println("enter customer name, customer id and address");
             
             c.name=sc.next();
             c.cid=sc.nextInt();
             c.address=sc.next();
             return c;
       }
       
       void show(Customer...cus)
       {
             for(Customer cust:cus)
             {
                    cust.display();
             }
       }
       
}
