package crud;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Callable2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/techrel","root","root");
		
		CallableStatement call=con.prepareCall("{call getbetweenid(?,?)}");
		call.setInt(1, 1);
		call.setInt(2, 4);
		ResultSet rs=call.executeQuery();
		
		//System.out.println(rs.getFetchSize());
		System.out.println();
		
		while(rs.next())
		{
			System.out.println("ID   :"+rs.getInt("id"));
			System.out.println("NAME : "+rs.getString("name"));
			System.out.println("*****************");
		}
		
		con.close();

	}

}
