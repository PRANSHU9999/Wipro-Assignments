package gaming;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getConnection() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/GAMINGCAFE";
		String user = "root";
		String password = "password@9999";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con =
				DriverManager.getConnection(url,user,password);

		return con;
	}
}