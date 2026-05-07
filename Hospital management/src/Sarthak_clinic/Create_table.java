package Sarthak_clinic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Create_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/mydata";
        String user = "root";
        String password = "password@9999";
        
     // Create table query
        String createTableQuery =
                "create table if not exists students ("
                + "rollno int, "
                + "name varchar(50), "
                + "per int, "
                + "email varchar(50))";
        
     // Insert records query
        String insertQuery =
                "insert into students values "
                + "(101,'Neeva Sharma',98,'abc@gmail.com'),"
                + "(102,'Reeva Sharma',89,'reeva@gmail.com'),"
                + "(103,'Shiva Upadhyay',79,'shiva@gmail.com')";
        
        try {

            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con =
                    DriverManager.getConnection(url, user, password);

            System.out.println("Connection Created");

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute create table query
            stmt.executeUpdate(createTableQuery);

            System.out.println("Students Table Created");

            // Execute insert query
            int rowsInserted = stmt.executeUpdate(insertQuery);

            if (rowsInserted > 0) {

                System.out.println(rowsInserted +
                        " Records Inserted Successfully");
            }

            // Fetch records
            ResultSet rs =
                    stmt.executeQuery("select * from students");

            System.out.println();
            System.out.println("ROLLNO\tNAME\t\t\tPER\tEMAIL");
            System.out.println("----------------------------------------------------");

            // Display records
            while (rs.next()) {

                int rollno = rs.getInt("rollno");
                String name = rs.getString("name");
                int per = rs.getInt("per");
                String email = rs.getString("email");

                System.out.println(
                        rollno + "\t"
                        + name + "\t\t"
                        + per + "\t"
                        + email);
            }

            // Close resources
            rs.close();
            stmt.close();
            con.close();

            System.out.println();
            System.out.println("Connection Closed");

        } catch (Exception e) {

            System.out.println(e);
        }
	}

}
