package inheritance;

public class Demo {
	public void kick()
	{
		System.out.println("kick everyone ");
	}
}
  class Demo1
   {
	static Demo out=new Demo();
	Demo d=new Demo();

     void run()
     {
	System.out.println("run raja");
}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1.out.kick();
        Demo1 d1=new Demo1();
        d1.run();
        d1.out.kick();
	}

}
