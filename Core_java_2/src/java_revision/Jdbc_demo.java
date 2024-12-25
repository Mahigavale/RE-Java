package java_revision;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc_demo {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/automationedge", "root", "root");

		System.out.println("connection opened.");
		System.out.println("getting the data..........");

		// System.out.println("Adding the static data into the Table :");
		int id = 3;
		String name = "Ashok Gavale";
		String dept = "HR";
		// DYNAMIC-QUERY
		PreparedStatement Statement=con.prepareStatement("Insert into Company values(?,?,?)");
		Statement.setInt(1, id);
		Statement.setString(2, name);
		Statement.setString(3, dept);
		int i=Statement.executeUpdate();
		System.out.println("no. of rows affected are :"+i);
		

//		// DQL Query
//		PreparedStatement Statement = con.prepareStatement("select * from Company;");
//		ResultSet rs = Statement.executeQuery();
//		while (rs.next()) {
//			System.out.println("*******************************");
//			System.out.println("id:" + rs.getInt(1));
//			System.out.println("name:" + rs.getString(2));
//			System.out.println("department:" + rs.getString(3));
//			System.out.println("*******************************");
		

		System.out.println("closing the connection.");
		con.close();

	}

}
