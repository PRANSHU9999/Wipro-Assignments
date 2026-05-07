package Sarthak_clinic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Altertable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/mydata";
        String user = "root";
        String password = "password@9999";
        
     // Add new column
        String addColumn =
                "alter table students add address varchar(50)";

        // Update queries
        String update101 =
                "update students set address='Pune' where rollno=101";

        String update102 =
                "update students set address='Mumbai' where rollno=102";

        String update103 =
                "update students set address='Chennai' where rollno=103";

        try {

            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con =
                    DriverManager.getConnection(url, user, password);

            System.out.println("Connection Created");

            // Create statement
            Statement stmt = con.createStatement();

            // Add new column
            stmt.executeUpdate(addColumn);

            System.out.println("New Column Added");

            // Update records
            stmt.executeUpdate(update101);
            stmt.executeUpdate(update102);
            stmt.executeUpdate(update103);

            System.out.println("Records Updated");

            // Fetch records
            ResultSet rs =
                    stmt.executeQuery("select * from students");

            System.out.println();
            System.out.println(
                    "ROLLNO\tNAME\t\tPER\tEMAIL\t\t\tADDRESS");

            System.out.println(
                    "--------------------------------------------------------------");

            // Display table
            while (rs.next()) {

                int rollno = rs.getInt("rollno");
                String name = rs.getString("name");
                int per = rs.getInt("per");
                String email = rs.getString("email");
                String address = rs.getString("address");

                System.out.println(
                        rollno + "\t"
                        + name + "\t"
                        + per + "\t"
                        + email + "\t"
                        + address);
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
