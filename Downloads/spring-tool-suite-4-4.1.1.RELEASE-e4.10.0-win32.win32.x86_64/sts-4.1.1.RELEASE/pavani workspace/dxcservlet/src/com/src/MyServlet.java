package com.src;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpServletEx
 */
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
		String u=request.getParameter("uname");
		String p=request.getParameter("pwd");
		
	    //step1:
            try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}//for oracle 
            Connection con=null;
            Statement st=null;
            ResultSet rs=null;
//          step2
            try {
                    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pavani");
                st=con.createStatement();
                rs=st.executeQuery("select * from users where username='"+u+"' and password='"+p+"'");
                response.setContentType("text/html");
     	       PrintWriter pw=response.getWriter();
            if(rs.next())
            {
            pw.print("Welcome to the application");	
            response.sendRedirect("home.html");
            }
            else {
            	response.sendRedirect("invalid.jsp");
            	pw.print("Get Lost");
            }
            
            
            
            } 
            
            
            
            
            catch (SQLException e) {
                   
                   e.printStackTrace();
            }
finally
{
     try {
            st.close();
     con.close();
     } catch (SQLException e) {
            
            e.printStackTrace();
     }
     
}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

} 