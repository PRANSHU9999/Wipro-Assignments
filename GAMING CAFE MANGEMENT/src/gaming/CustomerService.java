package gaming;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CustomerService {

	public static void addCustomer(Scanner sc)
	{
		try {

			Connection con = DBConnection.getConnection();

			System.out.println("Enter Name");
			String name = sc.nextLine();

			System.out.println("Enter Phone");
			String phone = sc.nextLine();

			String sql =
			"insert into customer(name,phone) values(?,?)";

			PreparedStatement ps =
					con.prepareStatement(sql);

			ps.setString(1,name);
			ps.setString(2,phone);

			ps.executeUpdate();

			System.out.println("Customer Added");

			System.out.println();
			System.out.println("Do You Want To Book Gaming Session?");
			System.out.println("1 Yes");
			System.out.println("2 No");

			int choice = sc.nextInt();
			sc.nextLine();

			if(choice==1)
			{
				BookingService.addBooking(sc);
			}

			con.close();

		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void viewCustomer()
	{
		try {

			Connection con = DBConnection.getConnection();

			PreparedStatement ps =
			con.prepareStatement("select * from customer");

			ResultSet rs = ps.executeQuery();

			while(rs.next())
			{
				System.out.println(
						rs.getInt(1)+" "
						+ rs.getString(2)+" "
						+ rs.getString(3));
			}

			con.close();

		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}