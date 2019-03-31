package intro;

import java.sql.*;

public class Account {

	public Connection getConn() throws SQLException 
	{ 	String url="jdbc:mysql://localhost:3306/";
	    String user="root";
	    String pass="root";
		Connection conn=null;
		conn=DriverManager.getConnection(url,user,pass);
		return conn;
		
	}
	public void withdraw(int amount) throws SQLException {
		getConn();
		System.out.println("program is executed");
	}
	
}
