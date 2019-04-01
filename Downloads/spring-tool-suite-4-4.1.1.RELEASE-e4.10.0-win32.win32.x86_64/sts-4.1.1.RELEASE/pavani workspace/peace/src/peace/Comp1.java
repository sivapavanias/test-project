package peace;
import java.util.Scanner;
 
public class Comp1
{
	    int a;
		private Scanner sc;
		static int b;
		public static void main(String args[])
		{
		Comp1 c=new Comp1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		c.a=sc.nextInt();
		b=sc.nextInt();
		c.add();
		c.sub(c.a);
		int result=square();
		System.out.println("result is"+result);
		int n=3;
		int result1= square1(n);
		System.out.println("result11 is with arg and return val"+result1);
		}
		 void add()
		{
		System.out.println("add of a and b is ---with arg no return val "+(a+b));
		}
		static void sub(int a)
		{
		System.out.println("sub of a and b is "+(a-b));
		}
		
public static int square()//with return a value from method
{
	
	return (10*10);
}
	static int square1(int i)
{
	return (i*i);
}
}

		 
