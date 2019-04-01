public abstract class Car {

public void applyBreak()
{
	
System.out.println("applying break to stop");

}
Car()
{

System.out.println("this is car constructor");
}

public abstract void changeGear();
}

abstract class BMWcar extends Car
{


public abstract void changeGear();

public abstract void automaticGears();

}


class BMW extends BMWcar

{
BMW()
{
System.out.println("this is bmw constructor");
}
@Override
public void changeGear() {
System.out.println("change gear");

}

public static void main(String[] args) {
BMW bmw =new BMW();

bmw.changeGear();
bmw.applyBreak();
}
@Override
public void automaticGears() {
// TODO Auto-generated method stub

}

}
 
