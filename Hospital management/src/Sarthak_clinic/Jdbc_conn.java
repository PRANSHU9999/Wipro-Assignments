package Sarthak_clinic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_conn {

    public static void main(String[] args) 
            throws ClassNotFoundException, SQLException {

        // Database details
        String url = "jdbc:mysql://localhost:3306/mydata";
        String user = "root";
        String password = "password@9999";

        // Load and register driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection created");

        // Create statement
        Statement stmt = con.createStatement();

        // Execute query
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");

        // Process result
        System.out.println("rollno\t f_name\t per");

        while (rs.next()) {

            int rollno = rs.getInt("rollno");
            String f_name = rs.getString("f_name");
            float per=rs.getFloat("per");

            System.out.println(rollno + "\t" + f_name + "\t" + per);
        }

        // Close connection
        rs.close();
        stmt.close();
        con.close();
    }
}
