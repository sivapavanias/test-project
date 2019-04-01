package peace;

public class ParentEx 
	{
		int a=90;
		static int b =78;
		ParentEx(int i,int j)
		{
		a=i;
		b=j;
		}
		ParentEx()
		{
	   }
	}	
	class ChildEx extends ParentEx
	{
		int x=76;
		static int y=87;
		ChildEx()
		{
			x=786;
			y=687;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
ParentEx pe=new ParentEx(3,5);
System.out.println("pe.a");
System.out.println("pe.b");
ChildEx ce= new ChildEx();
System.out.println(ce.x);
System.out.println(ce.y);
System.out.println(ce.a);

	}

}

