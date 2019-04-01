package peace;
import java.util.Scanner;
public class Threed {
void run(int n)
{
	System.out.println("run raja"+n+"km");
	}
static void walk(int x)
{
	System.out.println("rani walk"+x+"km");
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	 Scanner scan = new Scanner(System.in);
	 System.out.println("enter the parameter");
	 int ch=scan.nextInt();
	 while(ch<=10) {
	 Threed d=new Threed();
	walk(3);
	d.run(5);
	
}

}
}
