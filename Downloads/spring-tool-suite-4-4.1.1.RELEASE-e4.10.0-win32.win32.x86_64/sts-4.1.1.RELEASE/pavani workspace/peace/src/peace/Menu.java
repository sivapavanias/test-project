package peace;
import java.util.Scanner;
public class Menu {
	
	public class Myexcepyion extends Exception
	{
		Myexcepyion(String str)
		{
			super(str);
		}
		
	}

	private static final int op = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println();
		
			do
			{
		
		  System.out.println("MENU:");
          System.out.println("1.Area of a Circle");
System.out.println("2.Area of a Square");
System.out.println("3.Area of a Right Angled Triangle");
System.out.println("4.Area of a Rectangle");
System.out.println("5.Circumference of a Circle");
System.out.println("6.Perimeter of a Square");
System.out.println("7.area of traingle");
System.out.println("8.volume of cube");
System.out.println("9.area of cube");
System.out.println("10.exit");

          System.out.println("Enter your option:");
          if(op<0)
          {
        	  try {
        		  throw new Myexcepyion("invalid option");
        		          	  }
        	  catch(Myexcepyion e) {
        		  e.printStackTrace( );
        		          	  }
          }
		
          
		int op=s.nextInt();
		  switch(op)
          {
                case 1: System.out.println("Enter radius:");
                            float r=s.nextFloat();
                            float ac=3.14f*r*r;
                           System.out.println("Area:"+ac);
                           break;

               case 2: System.out.println("Enter side:");
                            int x=s.nextInt();
                            int as=x*x;
                           System.out.println("Area:"+as);
                           break;
               case 3: System.out.println("Enter height and base:");
                            float h=s.nextFloat();
                            float bs=s.nextFloat();
                            float art=0.5f*h*bs;
                           System.out.println("Area:"+art);
                           break;

              case 4: System.out.println("Enter length and breadth:");
                            int l=s.nextInt();
                            int b=s.nextInt();
                            int ar=l*b;
                           System.out.println("Area:"+ar);
                           break;

             case 5: System.out.println("Enter radius:");
                            float R=s.nextFloat();
                            float C=3.14f*2f*R;
                           System.out.println("Circumference:"+C);
                           break;


              case 6: System.out.println("Enter side:");
                            int X=s.nextInt();
                            int p=4*X;
                           System.out.println("Perimeter:"+p);
                           break;
                           
              case 7: System.out.println("Enter breadth and height");
              		int br=s.nextInt();
              		int hi=s.nextInt();
              		int Ar=(br*hi)/2;
              		System.out.println("Area of triangle:"+Ar);
              		break;
              case 8: System.out.println("Enter volume");
        		int vo=s.nextInt();
        		int vcube=vo*vo*vo;
        		System.out.println("volume of cubbe "+vcube);
        		break;
              case 9: System.out.println("Enter area");
      		int c=s.nextInt();
      		int carea=6*c*c;
      		System.out.println("area of cubbe "+carea);
      		break;
      		
              case 10:
            	   System.out.println("exit");
            	   break;
            	   default:
            		   System.out.println("invalid option"); 
              }
			}while(op<=10);
		}	
}

