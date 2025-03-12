package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Getdata {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techrel","root","root");
	
	
	
	     System.out.println("Connection Opened.....!!");
	     
	     
//	     Statement stmt=con.createStatement();
//	     
//	     String query="select * from Student;";
	     
	     
	     
	   //  int i=stmt.executeUpdate(query);
	     
	     
	     
	     PreparedStatement stmt=con.prepareStatement("select * from Student;");
	     
	     
	     //System.out.println("no of rows affected :"+i);
	     
	     ResultSet rs=stmt.executeQuery();
	     
	     while(rs.next())
	     {
	    	 System.out.println("ID :"+rs.getInt(1));
	    	 System.out.println("NAME :"+rs.getString(2));
	    	 System.out.println("****************************");
	     }
	     
	     
	     
	     con.close();
	     
	     
	     System.out.println("Connection closed.....!!");
	}

}
