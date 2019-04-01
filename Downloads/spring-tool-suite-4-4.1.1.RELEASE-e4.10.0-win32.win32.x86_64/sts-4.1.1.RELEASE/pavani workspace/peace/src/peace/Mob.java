package peace;

class Animal 
{
int teeth=32;
static int biscuits=3;
void run()
{
System.out.println("run like an animal");
}
static void eat()
{
System.out.println("eat like an animal");
}

}

class Dog extends Animal
{
int tail=1;
static int bones=2;

void bark()
{
System.out.println("bowwwww ");
}

static void sleeps()
{
System.out.println("sleepy dog");
}
}

class BullDog extends Dog
{
int legs=4;
static int nails=20;

void walk()
{
System.out.println("ramp walk");
}
static void kick()
{
System.out.println("kick every dog");
}
}

class Labs extends Dog
{
String color;
static String doctorname;

void bite()
{
System.out.println("bite suraj");
}

static void smell()
{
System.out.println("dont know what to smell");
}

}


class Cat extends Animal
{
int mustach=6;
static double milk=2.5;

void drink()
{
System.out.println("drink milk");
}
static void hunt()
{
System.out.println("hunt the rat");
}
}


class PussyCat extends Cat
{
int a=76;
static int b=54;
void wagsTail()
{
System.out.println("by saying meow meow");
}
static void jumps()
{
System.out.println("jumps alot");
}

}

class WildCat extends Cat
{
String breed = "tiger";
static String forestname="nallamalla";

void kills()
{
System.out.println("kills for food");
}
static void sees()
{
System.out.println("very keen to observe");
}
}
 
 
