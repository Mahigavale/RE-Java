package demor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jdbcdemo {

	public static void main(String[] args) {
		
		try {

		Class.forName("com.mysql.cj.jdbc.Driver");
	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
	     
	     System.out.println("connection opened !");
	     
	     PreparedStatement stmt=con.prepareStatement("select * from ddd;");
	     
	     
	     
	     
	     ResultSet rs=stmt.executeQuery();
	    // System.out.println("no. of rows affected are :"+i);
	     
	     while (rs.next())
	     {
	    	 System.out.println("id:"+rs.getInt("Id"));
	    	 System.out.println("name:"+rs.getString("Name"));
	     }
	     
	     con.close();
	
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		finally {
			
			System.out.println("code executed !");
		}
		}

}
