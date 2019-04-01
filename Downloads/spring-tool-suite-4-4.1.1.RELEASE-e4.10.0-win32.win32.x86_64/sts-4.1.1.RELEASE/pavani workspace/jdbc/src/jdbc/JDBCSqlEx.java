package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSqlEx {

       public static void main(String[] args) throws ClassNotFoundException {
             // TODO Auto-generated method stub
             String custname="sanjana";
             int cid=1111;
             String custadd="uppal";
             Class.forName("com.mysql.jdbc.Driver"); //loading a driver
             Connection con=null;
             Statement st=null;
             ResultSet rs=null;
             try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dxcdb","root","root");
             st=con.createStatement();
             //boolean b=st.execute("drop table customer");
             boolean b1=st.execute("create table customer1(cid int,custname varchar(30),custadd varchar(30))");
             int id=789;
             int i=st.executeUpdate("insert into customer1 values("+cid+",'"+custname+"','"+custadd+"')");
              int i1=st.executeUpdate("delete from customer1 where cid="+cid);
              if(i1>0) {
             	 System.out.println("val got deleted");
              }
              else {
            	  System.out.println();
              }
             rs=st.executeQuery("select * from customer1");
             while(rs.next())
             {
                    System.out.println(rs.getInt("cid")+"   "+rs.getString("custname")+"   "+rs.getString("custadd"));
             }
             
                    
             } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
             }
             
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



