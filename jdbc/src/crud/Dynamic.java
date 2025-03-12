package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Dynamic {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		
		
		System.out.println("enter  1 for adding the data ....");
		System.out.println("enter 2 for getting the data......");
		
		System.out.println("please enter the values:");
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the ID:");
		int id=scan.nextInt();
		
		System.out.println("Please enter the NAME:");
		String name=scan.next();
		
		System.out.println("********************Welcome to student management*************************** ");
		//Step 1
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techrel","root","root");
		
		System.out.println("Connection Opened.......!!!!");
		
		//Step 3
		
		Thread.sleep(3000);
		
		PreparedStatement stmt=con.prepareStatement("insert into Student values(?,?);");
		
		
		
		stmt.setInt(1, id);
		stmt.setString(2, name);
		
		//Step 4
		int i=stmt.executeUpdate();
		
		
		System.out.println("no. of rows affected....."+i);
		
		//Step 5
		con.close();
		System.out.println("Connection closed.......!!!!!");

	}

}
