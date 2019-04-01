package com.menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc implements db {
	@Override
	public void mysql() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void oracle() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) 
	{

	}
}

	
		// TODO Auto-generated method stub

 	/*@Override
	public void mysql() {
		// TODO Auto-generated method stub

		Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        try {
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dxcdb","root","root");
        st=con.createStatement();}
        finally
        {
               try {
                     st.close();
                     con.close();
               } catch (SQLException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
               }
        }
        }
	}
 		//@Override
	public void oracle() {
		// TODO Auto-generated method stub
		try{  
        	Connection con=null;
             Statement st=null;
        
        	//step1 load the driver class  
        	Class.forName("oracle.jdbc.driver.OracleDriver");  
        	  
        	//step2 create  the connection object  
        	Connection con1=DriverManager.getConnection(  
        	"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
        	  
        	//step3 create the statement object  
        	Statement stmt=con1.createStatement();  
      
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally
        {
               try {
                     Connection st;
					st.close();
                     Connection con1;
					con1.close();
               } catch (SQLException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
               }

}
 		}
		*/

		
