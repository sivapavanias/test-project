package com.exp;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipesStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PipedInputStream pis=new PipedInputStream();
		PipedOutputStream pos=new PipedOutputStream();
		pis.connect(pos);
		Thread t1=new Thread(){  
			public void run(){  
			for(int i=65;i<=90;i++){  
			try{  
			pos.write(i); 
			System.out.println(i);
			Thread.sleep(1000);  
			}catch(Exception e){
				System.out.println(e);
			}  
			}  
			}  
			};  
			//creating another thread t2 which reads the data  
			Thread t2=new Thread(){  
			public void run(){  
			try{   
			for(int i=65;i<=90;i++)  
			System.out.println(pis.read());  
			}catch(Exception e){
				System.out.println(e);
			}  
			}  
			};  
}
}
