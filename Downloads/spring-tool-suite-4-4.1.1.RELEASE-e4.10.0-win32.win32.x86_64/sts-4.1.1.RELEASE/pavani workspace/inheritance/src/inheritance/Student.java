package inheritance;
public class Student {
    int rolno;
    String name;
    String address;

    

    public Student(int rolno, String name, String address) 
    {
          this(rolno,name);
          
          this.address = address;
          
    }
    public Student(int rolno, String name) 
    {
          
    this(rolno);
          this.name = name;
    }
    
    public Student() {
          
    }

    public Student(int rolno) {
          this.rolno = rolno;
    }

    public static void main(String[] args) {
          // TODO Auto-generated method stub
          Student st = new Student(21,"sanju","uppal");
          System.out.println(st.name);
          System.out.println(st.rolno);
          System.out.println(st.address);
    }

}

