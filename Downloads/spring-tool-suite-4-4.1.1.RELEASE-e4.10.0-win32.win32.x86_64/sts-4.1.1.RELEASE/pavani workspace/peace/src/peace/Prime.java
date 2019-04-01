package peace;
class Prime
{
	int legs;
	static int food;
	void walk()
	{
		System.out.println("walk");
	}
	static void eat()
	{
		System.out.println("eating");
	}
public static void main(String[] args) {
	Prime p=new Prime();
	p.walk();
	eat();
}}

class Dog extends Prime
{
	int teeth;
	void bark() {
		System.out.println("barking");
	}
	void waggling()
	{
		System.out.println("wggling");
	}
	public static void main(String[] args) {
	{
		Dog de=new Dog();
		de.bark();
		
				}
}
	
}


	

		