package inheritance;
import java.util.Scanner;
/*public class Fatherclass {
	public void eat()
	{
		System.out.println("eats with right haand");
	}
static class Childclass extends Fatherclass
{
	public void eat()
	{
		
	
	System.out.println("eats left hand");
}
public static void main(String[] pav) {
		// TODO Auto-generated method stub
Childclass cc = new Childclass();
cc.eat();
	}

}
}*/
public class Fatherclass
{
static int a,b;
public static void main(String[] chiru) 
{
Scanner sc=new Scanner(System.in);

if(chiru.length>0)
{
int i=Integer.parseInt(chiru[0]);
int j=Integer.parseInt(chiru[1]);
System.out.println(i+j);
}
System.out.println("enter a and b value");
a=sc.nextInt();
b=sc.nextInt();

System.out.println(a+b);
}
}


 


