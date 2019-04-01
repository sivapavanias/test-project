package com.src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String firstname=request.getParameter("fname");
		String lastname=request.getParameter("lname");
		String m=request.getParameter("mobno");
		out.print("<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Insert title here</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<form action='RegisterServet'>\r\n" + 
				"\r\n" + 
				"enter first name : "+firstname+"<input type=\"hidden\" value=\""+firstname+"\" name=\"f\"><br>\r\n" + 
				"enter last name : "+lastname+"<input type=\"hidden\" value=\""+lastname+"\" name=\"l\"><br>\r\n" + 
				"enter mobile number : "+m+"<input type=\"hidden\" value=\""+m+"\" name=\"m\"><br>\r\n" + 
				"<input type=\"submit\"/>\r\n" + 
				"</form>\r\n" + 
				"</body>\r\n" + 
				"</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
