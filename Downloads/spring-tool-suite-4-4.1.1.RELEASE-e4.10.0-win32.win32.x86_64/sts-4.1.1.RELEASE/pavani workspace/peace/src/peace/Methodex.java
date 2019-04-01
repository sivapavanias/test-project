package peace;
import java.util.Scanner;
public class Methodex {
int a;
static int b;
public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Methodex ex=new Methodex();
		ex.a=scan.nextInt();
		int n=ex.addition()+sub();
		System.out.println(n);
	}
		int addition()
		{
		return a+b;
		}
static int sub()throws ArithimeticException
{
	 
	Methodex e=new Methodex();
	return e.a-b;
}
void run()throws 
 {
	 System.out.println("running");
 }
	}



