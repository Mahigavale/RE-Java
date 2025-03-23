package batchprocessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Second_batch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		
		System.out.println("please enter the number of students you want to add:");
		Scanner scan=new Scanner(System.in);
		int numbers=scan.nextInt();
		
		Map<Integer,String> Students=new HashMap<Integer,String>();
		
		for(int i=0;i<numbers;i++)
		{
			int id;
			String name;
		System.out.println("please enter the details of :"+(i+1));
		
		System.out.println("ID:");
		id=scan.nextInt();
		System.out.println("Name:");
		name=scan.next();
		Students.put(id, name);
		}
		
//		for(Map.Entry<Integer, String> entry: Students.entrySet())
//		{
//			System.out.println(entry.getValue());
//			System.out.println(entry.getKey());
//		}
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techrel","root","root");
		
		PreparedStatement stmt=con.prepareStatement("insert into student values(?,?)");
		
		con.setAutoCommit(false);
		
		
		System.out.println("creating batches");
		try {
		
		for(Map.Entry<Integer, String> entry:Students.entrySet())
			
		{
			stmt.setInt(1, entry.getKey());
			stmt.setString(2, entry.getValue());
			stmt.addBatch();
		}
      System.out.println("executing the batch:::");
      Thread.sleep(1500);
      
      int [] rows=stmt.executeBatch();
      
     System.out.println("total no.of rows affected:"+rows.length);
    
     con.commit();
     con.close();
     
     System.out.println("finished.....");
		}
		catch(Exception e)
		{
			con.rollback();
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("done !");
		}
		
	}

}
