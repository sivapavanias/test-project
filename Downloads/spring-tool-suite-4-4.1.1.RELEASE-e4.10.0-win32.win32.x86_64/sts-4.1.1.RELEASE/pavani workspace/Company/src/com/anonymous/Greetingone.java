package com.anonymous;
interface Greetings
{
public void morng();
public void eve();
public void ngt();
}
interface lab{
	public void white();
	public void black();
	public void blue();
}


class Hindi implements Greetings{

@Override
public void morng() {
// TODO Auto-generated method stub
System.out.println("shubhoday");

}

@Override
public void eve() {
// TODO Auto-generated method stub
System.out.println("shubhsandhya");
}

@Override
public void ngt() {
// TODO Auto-generated method stub
System.out.println("shubhrathri");

}


}
public class Greetingone {

public static void main(String[] args) {
Hindi h=new Hindi();
h.morng();
h.eve();
h.ngt();

Greetings eng=new Greetings() {

@Override
public void morng() {
// TODO Auto-generated method stub
System.out.println("good morning");
}

@Override
public void eve() {
// TODO Auto-generated method stub
System.out.println("good evening");
}

@Override
public void ngt() {
// TODO Auto-generated method stub
System.out.println("good night");
}
};
System.out.println(eng.getClass());
Greetings eng1=new Greetings() {

@Override
public void morng() {
// TODO Auto-generated method stub
System.out.println("good morning");
}

@Override
public void eve() {
// TODO Auto-generated method stub
System.out.println("good evening");
}

@Override
public void ngt() {
// TODO Auto-generated method stub
System.out.println("good night");
}
};
System.out.println(eng1.getClass());
Greetings eng2=new Greetings() {

@Override
public void morng() {
// TODO Auto-generated method stub
System.out.println("good morning");
}

@Override
public void eve() {
// TODO Auto-generated method stub
System.out.println("good evening");
}

@Override
public void ngt() {
// TODO Auto-generated method stub
System.out.println("good night");
}
};
lab bk=new lab()
{

	@Override
	public void white() {
		// TODO Auto-generated method stub
		System.out.println("whits");
		
	}

	@Override
	public void black() {
		// TODO Auto-generated method stub
		System.out.println("black");
		
	}

	@Override
	public void blue() {
		// TODO Auto-generated method stub
		System.out.println("blue");
		
	}
	
};
bk.black();
bk.blue();
System.out.println(eng2.getClass());
eng.morng();
eng.eve();
eng.ngt();

System.out.println(h.getClass());
}
}
