package inheritance;

public class Binding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle tr=new Triangle();
		tr.draw();
		Circle cir=new Circle();
		cir.draw();
		Rectangle rec=new Rectangle();
		rec.draw();
		
		
		//dynamic binding
		Shape s=new Triangle();
		s.draw();
		s=new Circle();
		s.draw();
		s=new Rectangle();
		s.draw();
	}
}

class Shape{
	 void draw()
	 {
		 System.out.println("draw a shape");
	 }

}
class Triangle extends Shape
{
	  void draw()
	  {
		  System.out.println("shape is traingle");
	  }
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("shape is ccircle");
	}
	
}
class Rectangle extends Shape
{
	 void draw()
	 {
		 System.out.println("shape is rectangle");
	 }
	
}