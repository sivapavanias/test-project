package polymorphism;

public class Super {
void run()
{
	System.out.println("run raja");
}
public class Child extends Super 
{
	int a=67;
	void run()
	{
		System.out.println("rani ");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super su = new Super();
		su.run();
		su.walk();
			}
 void  walk()
 {
	 System.out.println("walk like u wnat");
	 System.out.println(a);
	 super.run();
	 System.out.println(super.a);
	  }
}
