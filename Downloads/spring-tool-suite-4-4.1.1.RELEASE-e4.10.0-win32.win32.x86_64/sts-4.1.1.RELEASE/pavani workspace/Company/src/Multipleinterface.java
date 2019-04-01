interface A{
	public void kick();
	public void slap();
}
interface B extends A{
	public void sleep();
	public void wake();
	}
interface C extends B
{
	public void read();
	public void write();
	public void wake();
}
 public class Multipleinterface  implements A,B,C{
	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("reading");
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("writing");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleppping");
		
	}

	
	/*public void wake() {
		// TODO Auto-generated method stub
		System.out.println("waking");
		
	}*/

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		System.out.println("kicking");
	}

	@Override
	public void slap() {
		// TODO Auto-generated method stub
		System.out.println("slapping");
	}
		public void wake() {
			// TODO Auto-generated method stub
			System.out.println("waking");
		}
		
	
 
	public static void main(String[] args ) 
	{
		
		Multipleinterface mi= new Multipleinterface();
		mi.slap();
		mi.sleep();
		mi.kick();
		mi.wake();
		mi.read();
		mi.write();
	}

}
