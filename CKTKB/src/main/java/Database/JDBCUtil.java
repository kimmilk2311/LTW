package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    // JDBC driver class name and URL
    private static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;databaseName=TKB;encrypt=true;trustServerCertificate=true";
    
    // Database credentials
    private static final String USER = "sa";
    private static final String PASSWORD = "123456";

    // Method to get a database connection
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Load the JDBC driver
            Class.forName(JDBC_DRIVER);

            // Establish the database connection
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            System.out.println("Connected to the database!");
        } catch (ClassNotFoundException | SQLException e) {
            // Handle exceptions appropriately (log it, throw a custom exception, etc.)
            e.printStackTrace();
        }
        return connection;
    }

    // Method to close a database connection
    public static void closeConnection(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                // Close the connection if it's not null and not already closed
                connection.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            // Handle exceptions appropriately (log it, throw a custom exception, etc.)
            e.printStackTrace();
        }
    }
}
