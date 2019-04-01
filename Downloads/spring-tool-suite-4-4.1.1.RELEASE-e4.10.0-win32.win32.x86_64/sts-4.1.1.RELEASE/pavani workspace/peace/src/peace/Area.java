package peace;
public class Area
{
	final static double pi=3.14;
	int r,s,l,b,h;
	double base,height;
	Area()
	{
	r=10;
	s=2;
	l=2;
	b=3;
	h=10;
	height=20;
	base=20;
	}
	Area(String shape,double area)
	{
	System.out.println(shape);
	System.out.println("Area is  "+area);
	}
	
	Area(int area,String shape)
	{
	System.out.println(shape);
	System.out.println("Area is  "+area);
	}
	
	Area(String shape,int area)
	{
	System.out.println(shape);
	System.out.println("Area is  "+area);
	}
	
	Area(String shape,int length,int breadth)
	{
	System.out.println(shape);
	System.out.println("Area is  "+(length*breadth));
	}
	Area(int a,String shape,int b)
	{
	System.out.println(shape);
	System.out.println("Area is  "+(pi*a*b));
	}
	
	Area(int b,int h,String shape)
	{
	System.out.println(shape);
	System.out.println("Area is  "+(0.5*b*h));
	}
	
	Area(double base,int h,String shape)
	{
	System.out.println(shape);
	System.out.println("Area is  "+(base*h));
	}
	
	Area(String shape,int h,int a,int b)
	{
	System.out.println(shape);
	System.out.println("Area is  "+((a+b)/2)*h);
	}
	Area(String shape,double p,int q)
	{
	System.out.println(shape);
	System.out.println("Area is  "+((p*q)/2));
	}
	
	Area(int r,String shape,double h)
	{
	System.out.println(shape);
	System.out.println("Area is  "+(pi*r*r*h));
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Area a=new Area();
		System.out.println();
		double c=pi*a.r*a.r;
		Area a1=new Area("Circle",c);
		int d=a.s*a.s;
		Area a2=new Area(d,"Square");
		int e=6*d;
		Area a3=new Area("Cube",e);
		Area a4=new Area("Rectangle",a.l,a.b);
		Area a5=new Area(a.l,"Ellipse",a.b);
		Area a6=new Area(a.l,a.b,"Traingle");
		Area a7=new Area(a.base,a.l,"Parallellogram"); 
		Area a8=new Area("Trapezium",a.h,a.l,a.b);
		Area a9=new Area("Rhombus",a.base,a.h);
		Area a10=new Area(a.r,"Cylinder",a.height);
	}

} 
 

