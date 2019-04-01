package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class Generic
 */
public class Generic extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Generic() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String u=request.getParameter("uname");
		String p=request.getParameter("pwd");
		response.setContentType("text.html");
		PrintWriter ou=response.getWriter();
		if(u.equals(p)) {
			
			ou.print("welcome to generic servlet page");
		}
		else
		{
			
		ou.print("unable to load servlet");	
		}
		
		
	}

}
