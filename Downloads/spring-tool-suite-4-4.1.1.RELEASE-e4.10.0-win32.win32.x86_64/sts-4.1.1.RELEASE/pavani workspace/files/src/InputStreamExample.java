import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/*public class DataStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   FileOutputStream fos=new FileOutputStream("data.txt");
   DataOutputStream name=new DataOutputStream(fos);
   int a=90;
   char c='n';
   double d=12.3;
   name.writeInt(a);//writing
   name.writeChar(c);//writing
   name.writeDouble(d);//writing
   System.out.println("written");
   ////////Reading////////////
   FileInputStream fis=new FileInputStream("data.txt");
   DataInputStream dis=new DataInputStream(fis);
   
   int x=dis.readInt();///reading
   System.out.println(x);
   
   char ch=dis.readChar();//reading
   System.out.println(ch);
   
   double d1=dis.readDouble();
   System.out.println(d1);*/
		/*FileOutputStream fos=new FileOutputStream("buffer.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String s="welcome to dxc world";
		byte b[]=s.getBytes();
		bos.write(b);
		bos.close();
		fos.close();
		System.out.println("written");*/
		/*public class InputStreamExample {  
			public static void main(String[] args)throws Exception{  
			          String srg = "akkkakk";  
			          byte ary[] = srg.getBytes();  
			          ByteArrayInputStream array = new ByteArrayInputStream(ary);  
			          PushbackInputStream push = new PushbackInputStream(array);  
			          int i;        
			              while( (i = push.read())!= -1) {  
			                  if(i == 'k') {  
			                	  if(i == 'k') {   
			                      int j;  
			                      if( (j = push.read()) == 'k'){  
			                           System.out.print("iii");  
			                      }else {  
			                          push.unread(j);  
			                          System.out.print((char)j);  
			                      }  
			                  }else {  
			                              System.out.print((char)i);  
			                  }  
			                	  
			             }        
			  }   
			}
		}*/
public class SequenceInputStreamEx {

public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub

FileInputStream name1 = new FileInputStream("1.txt");
FileInputStream name2 = new FileInputStream("2.txt");
FileInputStream name3 = new FileInputStream("3.txt");
FileInputStream name4 = new FileInputStream("sample.txt");

Vector v=new Vector();

v.add(name1);
v.add(name2);
v.add(name3);
v.add(name4);

Enumeration e=v.elements();
SequenceInputStream sis = new SequenceInputStream(e);
int i=0;
while((i=sis.read())!=-1)
{
System.out.print((char)i);
}


}

}
/*
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {

public static void main(String[] args) throws FileNotFoundException {
// TODO Auto-generated method stub

FileOutputStream fos = new FileOutputStream("sample1.txt");
PrintStream out=new PrintStream(fos);
float f=9.8f;
out.printf("float value is %f",f);

out.println("hello all");
out.println("hello all");
out.println("hello all");

}

}
 
*/
/*
public class PrintStreamEx {

public static void main(String[] args) throws FileNotFoundException {
// TODO Auto-generated method stub

FileOutputStream fos = new FileOutputStream("sample1.txt");
PrintStream out=new PrintStream(fos);
float f=9.8f;
out.printf("float value is %f",f);

out.println("hello all");
out.println("hello all");
out.println("hello all");

}

}
*/
