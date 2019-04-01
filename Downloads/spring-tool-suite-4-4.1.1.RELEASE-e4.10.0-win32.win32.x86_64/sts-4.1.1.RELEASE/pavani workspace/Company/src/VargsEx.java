
public class VargsEx {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		VargsEx ve = new VargsEx();
		System.out.println(ve.total("pav",4));
		System.out.println(ve.total("ashu",3,4,5));
		System.out.println(ve.total("bujji",2,3,4,5,6));

	}
int total(String name ,int...marks)
{
	int total=0;
	/*for(int i=0;i<u.length;i++)
		sum=sum+u[i];
	
}
*/

for(int y:marks)
{
	total=total+y;
	
}
return total;

}
  System.out.println("name is"+name+ "marks are" +total);
}

