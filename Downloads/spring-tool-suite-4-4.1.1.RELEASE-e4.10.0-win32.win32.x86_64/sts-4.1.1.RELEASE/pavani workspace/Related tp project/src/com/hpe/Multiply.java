package com.hpe;

public class Multiply {
	protected int a;
	public void Multiply(int a , int b)
	{
	System.out.println("multiplication is a and b ia"+(a*b));
	}
	
public static void main(String[] args)
{
	Multiply  m = new Multiply ();
	m.Multiply(3, 5);
}

}

