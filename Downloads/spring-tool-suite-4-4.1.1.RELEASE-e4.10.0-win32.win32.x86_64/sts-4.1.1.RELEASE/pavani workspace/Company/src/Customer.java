class Customer {
	String name;
	int cid;
	String address;
	void display()
	{
		System.out.println(name+"  "+cid+"  "+address);
	}
static class Miancustomer{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
   Customer c = new    Customer();
   c.name="ashu";
   c.cid=12;
   c.address="cpt";
   c.display();
   Customer[] c1 = new Customer[4];
   c1[0]=new Customer();
   c1[0].address="hitech";
   
	}
}
}
