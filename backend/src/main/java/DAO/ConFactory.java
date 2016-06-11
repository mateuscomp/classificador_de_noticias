package DAO;

import java.sql.*;

public class ConFactory {
	
	public Connection getConnection() throws runtimeException {
		
		try {
			return DriverManager.getConnection("jdbc:mysql://50.40.55.6/", "root", "53nh4615243");
		
		}catch (SQLException e) {
			throw new runtimeException(e);
			
		}
	}
	
}
