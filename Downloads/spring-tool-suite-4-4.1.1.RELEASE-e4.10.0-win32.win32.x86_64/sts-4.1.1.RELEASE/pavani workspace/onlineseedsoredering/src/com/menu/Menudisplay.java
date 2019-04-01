package com.menu;
import java.util.Scanner;

public class Menudisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
			Scanner sc=new Scanner(System.in);
			do {
			String menu="Choose from the following options :\n1.All Seeds\n"
					+ "2.Flowering seeds\n"
					+ "3.Vegetable seeds\n"
					+ "4.Fruit Seeds\n"
					+ "5.Ornamental Plant Seeds\n"
					+ "6.Seeds By Flower Colour\n"
					+ "7.Seeds By Placement\n"
					+ "8.Seeds By their Uses\n"
					+ "9.Seeds By Type\n"
					+ "10.Tree And Forestry Seeds\n"
					+ "11.exit";
			System.out.println(menu);
			n=sc.nextInt();
			
			switch(n)
			{
			case 1:
			{
			LamdaEx le=(i,j)->System.out.println(i+j);
			le.performOperation(10, 20);
			break;
		
			}
			case 2:
			{
				LamdaEx le=(i,j)->System.out.println(i-j);
				le.performOperation(20, 10);
				break;
				
			}
			case 3:
			{
				LamdaEx le=(i,j)->System.out.println(i*j);
				le.performOperation(10, 20);
				break;
			}
			case 4:
			{
				LamdaEx le=(i,j)->System.out.println(i/j);
				le.performOperation(20, 10);
				break;
			}
			case 5:
			{
				LamdaEx le=(i,j)->System.out.println(i%j);
				le.performOperation(10, 20);
				break;
			}
			case 6:
			{
				LamdaEx le=(i,j)->System.out.println(i^j);
				le.performOperation(12, 14);
				break;
			}
			case 7:
			{
				LamdaEx le=(i,j)->System.out.println(i<<j);
				le.performOperation(5, 1);
				break;
			}
			case 8:
			{
				LamdaEx le=(i,j)->System.out.println(i>>j);
				le.performOperation(5,1);
				break;
			}
			case 9:
			{
				Lamda1 l=(i)->System.out.println(++i);
				l.unaryOperations(5);
				break;
			}
		
			case 10:
			{
				Lamda1 l=(i)->System.out.println(--i);
				l.unaryOperations(5);
				break;
				
			}
			case 11:
			{
				Lamda1 l=(i)->System.out.println(~i);
				l.unaryOperations(5);
				break;
				
			}
			case 12:
			{
				System.out.println("The end");
				return;
			}
			
			}
		}while(n!=0);
		
}
}

	


