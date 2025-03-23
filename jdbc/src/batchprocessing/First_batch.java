package batchprocessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class First_batch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techrel","root","root");
		
		
		con.setAutoCommit(false);
		
		
		PreparedStatement stmt=con.prepareStatement("insert into student values(?,?) ;");
		
		stmt.setInt(1, 5);
		stmt.setString(2,"John");
		stmt.addBatch();
		stmt.setInt(1, 4);
		stmt.setString(2, "Peter");
		stmt.addBatch();
		
		try {
		int[] rows=stmt.executeBatch();
		
		for(int j:rows)
		{
			System.out.println("no of rows affected"+j);
		}
		
		System.out.println("Finished");
		
		con.commit();
		con.close();
		}
		catch(Exception e)
		
		{
			System.out.println("exception occured.....");
			System.out.println("intiating rollback.....");
			Thread.sleep(3000);
			con.rollback();
			
			System.out.println("rollback finished. no data added !");
			System.out.println("Reason :"+e.getMessage());
		}
		
		

	}

}
