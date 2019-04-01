package com.pavani;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/SaveServlet")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
 //System.out.println("............");
 //out.println("/////////");
    /**
     * Default constructor. 
     */
    public Demo() {
    	System.out.println(".const ...........");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("doget....");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.setContentType("text/html");
		response.setContentType("text/html");  
		PrintWriter pw=response.getWriter();  
		  
		String name=request.getParameter("name");//will return value  
		pw.println("Welcome "+name);  
		  
		pw.close();  
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("dopost....");
		String a=request.getParameter("name");
		System.out.println("welcome :"+a);
		String s=request.getParameter("email");
		System.out.println("email" +s);
		
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		pw.print("pavani"+"your name  is "+a);
		pw.print("pavani"+"your email is "+s);

 //RequestDispatcher rd =request.getRequestDispatcher("/welcome.html");
 //Srd.forward(request, response);
 
      
		//doGet(request, response);
	}

}
