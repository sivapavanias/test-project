package peace;
import java.util.Scanner;
  class Shape
  {
   double radius;
   }
 class Circle extends Shape
{
final static double pi=3.14;
public double areaOfCircle()
{
return pi*radius*radius;
}
}
class Cylinder extends Circle
{
double height;
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Cylinder c=new Cylinder();
System.out.println("enter radius ");
c.radius=sc.nextInt();
System.out.println("enter height ");
c.height=sc.nextInt();
System.out.println("area of cylinder is "+c.areaofCylinder(c.height));
}
public double areaofCylinder(double h)
{
	return areaOfCircle()*h;
}} 