package dipatch.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
		/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		  PrintWriter out = response.getWriter();  
		  System.out.println("1st servlet");
				String n=request.getParameter("username");  
				out.print("welcome"+n);
			     System.out.println("ppppp::::"+n);
			   // response.sendRedirect("https://www.javatpoint.com/sendRedirect()-method");  
			    Cookie ck=new Cookie("username",n);//creating cookie object  
			    response.addCookie(ck);
			    //adding cookie in the response  
			    out.print("<form action='Welcomepage'>");  
			    out.print("<input type='submit' value='go'>");  
			    out.print("</form>");
		doGet(request, response);
	}
			   
			    
			    
			    
			    }
	
