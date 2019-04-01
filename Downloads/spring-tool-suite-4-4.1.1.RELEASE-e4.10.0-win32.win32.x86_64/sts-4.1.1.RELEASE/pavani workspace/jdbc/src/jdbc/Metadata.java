package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class Metadata {

       public static void main(String[] args) throws ClassNotFoundException {
             // TODO Auto-generated method stub
    	   Scanner sc=new Scanner(System.in);
             /*String custname="sanjana";
             int cid=1111;
             String custadd="uppal";*/
             Class.forName("com.mysql.jdbc.Driver"); //loading a driver
             Connection con=null;
             PreparedStatement ps =null;
             try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dxcdb","root","root");
             ps=con.prepareStatement("insert into customer1 values(?,?,?)");
            for(int x=0;x<=2;x++) {
            System.out.println("enter cudtomer id and name and address");
           int i=sc.nextInt();
           String name=sc.next();
           String add=sc.next();
           ps.setInt(1, i);
           ps.setString(2, name);
           ps.setString(3, add);
             
            int j=ps.executeUpdate();
                    
             }} catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
             }
             
             finally
             {
                    try {
                          ps.close();
                          con.close();
                    } catch (SQLException e) {
                          // TODO Auto-generated catch block
                          e.printStackTrace();
                    }
             }
       }

}



