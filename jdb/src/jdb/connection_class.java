package jdb;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection_class {

	public Connection getConnection()throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");//Load and register driver
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chandigaruniversity","root","Harsh@123");
		System.out.println("Connection Established");

	}

}
\