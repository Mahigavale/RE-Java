package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class First {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
	
		//Step 1: registering a Driver.
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2: Opening a connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techrel","root","root");
		
		System.out.println("Connection Opened.........!!!!");
		
		//Thread.sleep(2500);
	
		String query="insert into Student values(3,'VVS');";
		
		//Step 3: writing a query.
		Statement stmt=con.createStatement();
		
		//Step 4 Execute 
		
		int rows_affected=stmt.executeUpdate(query);
		
		System.out.println("no of rows affected :"+rows_affected);
		
		//Con close
		
		con.close();
		
		System.out.println("Connection closed......!!!!");
	}

}
