package Test;

import java.sql.Connection;
import java.sql.SQLException;

import Database.JDBCUtil;

public class TestConnection {
	  public static void main(String[] args) throws SQLException {
	    	Connection connection = JDBCUtil.getConnection();
			System.out.print(connection);
			JDBCUtil.closeConnection(connection);
			System.out.print(connection);
		}
}
