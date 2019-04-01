		class Company
		{
			int num=900;
		   public void methodCompany()
		   {
		      System.out.println("method of Class company");
		   }
		}
		class Infra extends Company
		{
			int num=800;
		   public void methodInfra()
		   {
		      System.out.println("method of Class methodInfra ");
		      System.out.println("using super keyword get the parent class value"+super.num);
		   }
		}
		class Client extends Company
		{
		  public void methodClient()
		  {
		     System.out.println("method of Class Client");
		  }
		}
		class Employee extends Company
		{
		  public void methodEmployee()
		  {
		     System.out.println("method of Class Employee");
		  }
		}
	////overloading
		class CompanyOverloading
		{
		    public void disp(String s)
		    {
		         System.out.println(s);
		    }
		    public void disp(String s, int num)  
		    {
		         System.out.println(s + " "+num);
		    }
		}
		////overridding
		class Companyoverriding
		{
			void pay()
			{
				System.out.println("pays good");
			}
		}	
		class Third extends Companyoverriding
		{
			void pay()
			{
				System.out.println("thirdparty pays good");
			}
		}
		class Onsiteclient extends Companyoverriding
		{
			void pa() {
				System.out.println("this is onsite");
			}
		}
		///static binding
		
		
		
		class Hierarchy
		{
		  public static void main(String args[])
		  {
		     Infra obj1 = new Infra();
		     Client obj2 = new Client();
		     Employee obj3 = new Employee();
		     //All classes can access the method of class A
		     System.out.println("shows interitance method of class company");
		     obj1.methodCompany();
		     obj2.methodCompany();
		     obj3.methodCompany();
		     ////overloading
		     System.out.println("overloading");
		     CompanyOverloading co=new CompanyOverloading();
		     co.disp("emp of the year");
		     co.disp("pavani",1155);
		     ////overridding
		     System.out.println("overriding");
		     Companyoverriding ride=new Companyoverriding();
		     ride.pay();
		     ///dynamic binding
		     System.out.println("Dynamic binding");
		     Companyoverriding ride1=new Third();
		     ride1.pay();
		     ride1=new Onsiteclient();
		     ride1.pay();
		    //super keyword
		    Infra i1 = new Infra();
		    i1.methodInfra();
		    
		     
		     
		  }
		

	}


