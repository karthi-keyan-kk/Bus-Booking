package JDBCBusBooking;

import java.sql.*;

public class DbConnection {
	private static final String url = "jdbc:mysql://localhost:3306/karthikeyan";
	private static final String userName = "root";
	private static final String passWord = "@karthiKeyan1234";
	
	public static Connection getConnection() throws SQLException{
		return  DriverManager.getConnection(url,userName,passWord);
	}

}
