package polymorphism;
public class OverLoaddingExample {

int add(int a,int b)
{

return a+b;

}

double add(double x,double y)
{

return x+y;
}

int add(int i,int j,int k)
{
return i+j+k;
}
double add(float m,float n)

{
	return m*n;
}

public static void main(String[] args) {
OverLoaddingExample ol = new OverLoaddingExample();

System.out.println(ol.add(45, 56, 78));
System.out.println(ol.add(67.4, 89.7));
System.out.println(ol.add(4, 5));
System.out.println(ol.add(4.98f, 5.0));


}
}



