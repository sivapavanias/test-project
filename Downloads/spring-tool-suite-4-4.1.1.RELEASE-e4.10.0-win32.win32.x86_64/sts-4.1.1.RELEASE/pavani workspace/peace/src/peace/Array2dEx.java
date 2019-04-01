package peace;

import java.util.Scanner;
class Array2dEx
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int m=sc.nextInt();
		System.out.println("Enter the number of columns");
		int n=sc.nextInt();
		System.out.println("Enter"+(m*n)+"elements");
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
	  {
		for(int j=0;j<n;j++)
		{
			a[i][j]=sc.nextInt();
		}
	  }
	  for(int i=0;i<m;i++)
	  {
		for(int j=0;j<n;j++)
		{
		System.out.print(a[i][j]);
		}
		System.out.println();
	  }
	   int max=a[0][0];
	   int min=a[0][0];
		for(int i=0;i<m;i++)
	   {
		for(int j=0;j<n;j++)
		{
			if(a[i][j]>max)
			{
			max=a[i][j];
			}
			if(a[i][j]<min)
			{
			min=a[i][j];
			}
		}
	   }
	System.out.println("Maximum element is"+max);
	System.out.println("Minimum element is"+min);
	}
}