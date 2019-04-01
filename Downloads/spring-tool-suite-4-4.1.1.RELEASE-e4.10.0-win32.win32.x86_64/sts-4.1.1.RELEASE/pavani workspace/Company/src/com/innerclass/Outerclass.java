package com.innerclass;

public class Outerclass {
			int b=87;
		public void walk()
		{
			System.out.println("walk............");
		}
		
	
		static class Innerclass1
		{
			int a=90;
			public void run()
			{
			System.out.println("run......");
		}
		}
		/////member class
			class Innerclass2{
				int x=80;
				public void work()
				{
					System.out.println("working.....");
					
					/////inner class demo
					class Runner{
						
						public void mobility()
						{
							System.out.println("mobility.......");
						}
					}
					Runner rr = new Runner();
					rr.mobility();
					}
				}
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
class Outermain
{
	public static void main(String[]args)
	{
		Outerclass oc=new Outerclass();
		oc.walk();
		System.out.println(oc.b);
		Outerclass.Innerclass1 ic=new Outerclass.Innerclass1();
		ic.run();
		System.out.println("oc.a");
		Outerclass.Innerclass2 pr=oc.new Innerclass2();
		System.out.println(pr.x);
		pr.work();
		
	}
}
