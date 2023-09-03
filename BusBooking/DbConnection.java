package JDBCBusBooking;

import java.sql.*;

public class DbConnection {
	private static final String url = "jdbc:mysql://localhost:3306/karthikeyan";
	private static final String userName = YOUR-USER-NAME;
	private static final String passWord = YOUR-PASSWORD;
	
	public static Connection getConnection() throws SQLException{
		return  DriverManager.getConnection(url,userName,passWord);
	}

}
