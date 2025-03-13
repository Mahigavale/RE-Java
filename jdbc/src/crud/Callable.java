package crud;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Callable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techrel","root","root");
		
		
		int id;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the id you want to fetch :");
		id=scan.nextInt();
		CallableStatement call=con.prepareCall("{call getbyid(?)}");
		
		call.setInt(1, id);
		
		
		ResultSet rs=call.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println("#################");
		}

	}

}