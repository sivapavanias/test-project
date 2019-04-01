package com.src;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("applicationcontext.xml");
 BeanFactory bean=new XmlBeanFactory(resource);
 
 Pojo p=(Pojo) bean.getBean("poo");
 p.setCid(133);
 p.setAddress("hyd");
 p.setCname("pav");
 System.out.println(p);
 Pojo p1=(Pojo) bean.getBean("pen");
 Address ad=new Address();
 ad.setHno(89);
 ad.setHname("paradise");
 ad.setCityname("secbad");
 Address ad1=new Address();
 ad1.setHno(189);
 ad1.setHname("paradise1");
 ad1.setCityname("secbad1");
 ArrayList <Address>=new ArrayList();
 System.out.println(p);
	}

}
