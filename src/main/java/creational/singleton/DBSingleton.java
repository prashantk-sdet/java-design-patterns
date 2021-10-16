package creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSingleton {
	
	private static volatile DBSingleton instance = null;
	private static volatile Connection conn = null;
	
	private DBSingleton() {
		
		if(instance !=null) {
			throw new RuntimeException("use getInstance() method to create");
		}
	}
	
	public static DBSingleton getInstance() {
		if(instance == null) {
			synchronized(DBSingleton.class) {
				if(instance == null)
				instance = new DBSingleton();
			}
		}
		return instance;
	}
	
	public Connection getConnection() {
		if(conn == null) {
			synchronized(DBSingleton.class) {
				if(conn == null) {
					try {
						String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
						conn = DriverManager.getConnection(dbUrl);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return conn;
	}
}
