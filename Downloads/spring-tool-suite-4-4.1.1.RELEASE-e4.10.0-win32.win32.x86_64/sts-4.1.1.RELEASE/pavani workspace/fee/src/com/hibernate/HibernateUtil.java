package com.hibernate;
//package com.tutorialsdesk.hibernate;

import org.hibernate.SessionFactory;

import com.fasterxml.classmate.AnnotationConfiguration;
//import org.hibernate.cfg.AnnotationConfiguration; 

 
public class HibernateUtil {
 
 private static final SessionFactory sessionFactory = buildSessionFactory();

  private static SessionFactory buildSessionFactory() {
   try {
    //return ((Object) new AnnotationConfiguration()).configure().buildSessionFactory(); 
   } catch (Throwable ex) {
    System.err.println("Initial SessionFactory creation failed." + ex);
    throw new ExceptionInInitializerError(ex);
   }
return null;
  }

  public static SessionFactory getSessionFactory() {
   return sessionFactory;
  }

  public static void shutdown() {
   getSessionFactory().close();
  }


}