package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Execute {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techrel","root","root");
		
		
		PreparedStatement stmt=con.prepareStatement("select * from student;");
		
	    boolean flag= stmt.execute();
	    
	    //return type int=> DML =>False
	    //return type table=>DQL=> True
	    System.out.println("flag:"+flag);
	    con.close();
	    
	    
		
	}

}
