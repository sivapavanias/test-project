import java.util.Iterator;

public class Thread1 extends Thread{
	public Thread1(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }
	Thread currThread = Thread.currentThread();
	//System.out.println("Thread created is "+currThread);
	
	

	
		public  void run()
		{
			System.out.println(currThread);
			for (int i = 0; i <=5; i++) {
				System.out.println(i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
									}
				System.out.println("thread 1 running");
							}
		}
		
	//System.out.println("thread 1 running");	
}
class Mobile implements Runnable
{
	Thread currThread = Thread.currentThread();
	public void run()
	{
		System.out.println(currThread);
		System.out.println(Thread.currentThread().getName());    
		
		for (int i = 6; i <=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			
			System.out.println("thread 2 running");
	}
	
}
}
class Tv implements Runnable
{
	Thread currThread = Thread.currentThread();
	@Override
	public void run() {
		System.out.println(currThread);
		System.out.println(Thread.currentThread().getName());    
		// TODO Auto-generated method stub
		for (int i = 11; i <=15; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			System.out.println("thread 3 running");
	}
	
}
}
class Chess implements Runnable
{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());    
		// TODO Auto-generated method stub
		for (int i = 15; i <=20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			System.out.println("thread 4 running");
		
	}
	
}
}
class Carroms implements Runnable
{

	
	@Override
		public void run() {
		System.out.println(Thread.currentThread().getName());    
		// TODO Auto-generated method stub
		for (int i = 20; i <=25; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			System.out.println("thread 5 running");
			
		
	}
	
}


}






