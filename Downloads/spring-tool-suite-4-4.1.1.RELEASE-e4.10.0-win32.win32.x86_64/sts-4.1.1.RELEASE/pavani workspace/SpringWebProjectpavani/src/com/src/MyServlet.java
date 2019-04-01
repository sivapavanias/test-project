package com.src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Resource resource=new ClassPathResource("spring.xml");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		/*int eid=Integer.parseInt(request.getParameter("eid"));
		String name=request.getParameter("ename");
		String address=request.getParameter("address");
		
		Employee e=(Employee) context.getBean("emp");
		e=new Employee(eid,name,address);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();*/
		Employee e=(Employee) context.getBean("emp");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print(e);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
