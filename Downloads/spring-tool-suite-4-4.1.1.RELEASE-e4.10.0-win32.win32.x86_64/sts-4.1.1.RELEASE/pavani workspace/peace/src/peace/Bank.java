package peace;

public class Bank {
	// TODO Auto-generated method stub
			String branchname;
			static double rbirateofinstrest;
			void nonMaintainancecharges()
			{
				System.out.println("500rsfine for"+branchname+"with rate of instrest"+rbirateofinstrest);
			}
static void averageBalance(Bank b)
{
	System.out.println("1000"+b.branchname +b.rbirateofinstrest);
}
Bank()
{
	branchname="madhapur";
	rbirateofinstrest=15.50;
}
Bank(String name,double roi)
{
	System.out.println("parametric contruct");
	branchname=name;
	rbirateofinstrest=roi;
}
Bank(String name)
{
	branchname=name;
}
Bank(double roi)
{
	rbirateofinstrest=roi;
}
	public static void main(String[] args) {
		Bank ban=new Bank();
		System.out.println(ban.branchname);
		System.out.println(ban.rbirateofinstrest);
		ban.nonMaintainancecharges(); 
		averageBalance(ban);
		Bank ban1=new Bank("hitechcity",14.25);
		System.out.println(ban1.rbirateofinstrest);
		averageBalance(ban1);
		System.out.println("contrctor only having branchname");
		Bank ban2=new Bank("sr nagar");
		System.out.println(ban2.rbirateofinstrest);
		averageBalance(ban2);
		System.out.println("contrctor only having rate of intrest");
		Bank ban3=new Bank(76.32);
		System.out.println(ban3.rbirateofinstrest);
		averageBalance(ban3);
	}

}
