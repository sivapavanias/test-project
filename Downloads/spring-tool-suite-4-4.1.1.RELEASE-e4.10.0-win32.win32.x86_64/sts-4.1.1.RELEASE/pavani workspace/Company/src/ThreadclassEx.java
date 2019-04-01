public class ThreadclassEx {
public static void main(String[] args) {
// TODO Auto-generated method stub
	ThreadGroup group = new ThreadGroup("GroupA");
	
Thread1 t1 = new Thread1(threadgroup GroupA, int t);
t1.setPriority(1);
t1.setName("pav");
Mobile t=new Mobile();
Thread t2=new Thread(t);
t2.setPriority(2);
t2.setName("ashu");
Tv tx=new Tv();
Thread t3=new Thread(tx);
t3.setPriority(3);
t3.setName("padhu");
new Thread1(group, "t1").start();
new Thread1(group, "t2").start();
new Thread1(group, "t3").start();
Chess c=new Chess();
Thread t4=new Thread(c);
t4.setPriority(4);
t4.setName("venubujji");
Carroms cr=new Carroms();
Thread t5=new Thread();
t5.setPriority(5);
t5.setName("kaju");
t1.start();

t2.start();
t3.start();
t4.start();

}
}
