
public class RunnableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t = new Table();
		Thread t1=new Thread(new Runnable() {
		public void run()
		{
			
			t.display(5);
		}
	});
Thread t2=new Thread(()->{
	
	t.display(5);

});
t1.start();
t2.start();
}
}
class Table
{
	void display(int n)
	{
		for(int i=1;i<=10;i++)
			System.out.println(n+"x"+i+"="+(n*i));
	}
}

