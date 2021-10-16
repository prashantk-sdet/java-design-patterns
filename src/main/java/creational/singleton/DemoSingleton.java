package creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoSingleton {

	public static void main(String[] args) {
		DBSingleton instance = DBSingleton.getInstance();
		System.out.println(instance);
		
		Connection conn = instance.getConnection();
		
		Statement st;
		
		try {
			st = conn.createStatement();
			st.executeUpdate("CREATE TABLE TEST(ID INT)");
			System.out.println("Table created");
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
