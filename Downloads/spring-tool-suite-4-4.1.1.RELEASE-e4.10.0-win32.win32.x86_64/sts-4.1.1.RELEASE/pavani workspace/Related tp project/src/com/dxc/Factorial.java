package com.dxc;

public class Factorial {
	 public void fact(int num)
     {
       // int num = 10;
        //long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            int factorial = i;
        }
     }
    public static void main(String[] args) {
    	Factorial fa = new Factorial();
           fa.fact(3);
           System.out.println(fa.fact(3));
           
    
       
    }
}
