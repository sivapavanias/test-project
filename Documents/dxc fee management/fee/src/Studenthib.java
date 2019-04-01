
//import java.util.ArrayList;
import java.util.ArrayList;

import org.hibernate.*;

import com.hibernate.HibernateUtil;
//import com.tutorialsdesk.hibernate.bean.Student;

public class Studenthib {

 public static void saveUser(Student student) {
   Session session = HibernateUtil.getSessionFactory().openSession();
   session.beginTransaction();

   session.save(student);

   session.getTransaction().commit();
  }

  public void updateUser(Student student) {
   Session session = HibernateUtil.getSessionFactory().openSession();
   session.beginTransaction();

   session.merge(student);

   session.getTransaction().commit();
  }

  public void deleteUser(Student student) {
   Session session = HibernateUtil.getSessionFactory().openSession();
   session.beginTransaction();

   session.delete(student);

   session.getTransaction().commit();
  }

  public void getUser() {
   Session session = HibernateUtil.getSessionFactory().openSession();
   session.beginTransaction();

   ArrayList<Student> list = (ArrayList<Student>) session.createQuery("from Student").list();
   if (list != null) {
    for (int i = 0; i < list.size(); i++) {
     System.out.println("User ID : " + list.get(i).getDue());
     System.out.println("User First Name : "+ list.get(i).getFee());
     System.out.println("User Last Name : "+ list.get(i).getPaid());
     System.out.println("User Roll No : " + list.get(i).getSex());
     System.out.println("User Address : " + list.get(i).getCourse());
    
   }
   }
   session.getTransaction().commit();
  }

}
