package peace;
import java.util.Scanner;
public class Twod {
	public static void main(String[] args)
	{
	int row, col, i, j;
	char ch[][]=new char[10][10];
    //int arr[][] = new int[10][10];
    Scanner scan = new Scanner(System.in);
	   
    System.out.print("Enter Number of Row for Array (max 10) : ");
    row = scan.nextInt();
    System.out.print("Enter Number of Column for Array (max 10) : ");
    col = scan.nextInt();
	   
    System.out.print("Enter " +(row*col)+ " Array Elements : ");
    for(i=0; i<row; i++)
    {
        for(j=0; j<col; j++)
        {
          //  arr[i][j] = scan.nextInt();
            ch[i][j]=scan.next().charAt(0);
        }
    }
    System.out.print("The Array is :\n");
    for(i=0; i<row; i++)
    {
        for(j=0; j<col; j++)
        {
            System.out.print(ch[i][j]+ "  ");
        }
        System.out.println();
    }
}
}