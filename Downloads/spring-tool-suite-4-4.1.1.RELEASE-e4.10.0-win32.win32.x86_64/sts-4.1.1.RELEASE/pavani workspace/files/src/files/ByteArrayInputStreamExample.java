package files;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample{    
 public static void main(String args[]){    
  try{  
	  byte b[]= {45,67,45,67,7};
	  ByteArrayInputStream name = new ByteArrayInputStream(b);
       
    int i=0;    
    while((i=name.read())!=-1){    
     System.out.println((char)i);    
    }    
    name.close();    
    name.close();  
    name.mark(5);
    name.available()
    System.out.println(name);
    
  }
  catch(Exception e){
	  System.out.print(e);
	  }    
 }    
}  