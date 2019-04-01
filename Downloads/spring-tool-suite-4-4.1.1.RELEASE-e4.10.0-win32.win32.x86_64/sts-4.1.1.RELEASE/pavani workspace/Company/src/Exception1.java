import java.util.Scanner;
public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two val");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
		String ar=null;	
		int c=a/b;
		System.out.println(c);
		System.out.println(ar.length());
		int array[]= {2,3,4};
		for (int i = 0; i <3; i++) {
			System.out.println(array[i]);
			
		}
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}

		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
*/
		finally
		{
			System.out.println("end of progra");
		}
	}
}



