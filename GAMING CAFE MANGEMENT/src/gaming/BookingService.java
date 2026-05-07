package gaming;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BookingService {

	public static void addBooking(Scanner sc)
	{
		try {

			Connection con = DBConnection.getConnection();

			PreparedStatement ps1 =
			con.prepareStatement("select * from game");

			ResultSet rs1 = ps1.executeQuery();

			System.out.println("AVAILABLE GAMES");

			while(rs1.next())
			{
				System.out.println(
						rs1.getString(2)+" PRICE: "
						+ rs1.getInt(3));
			}

			System.out.println();

			System.out.println("Enter Customer Name");
			String cname = sc.nextLine();

			System.out.println("Enter Game Name");
			String game = sc.nextLine();

			System.out.println("Enter Hours");
			int hours = sc.nextInt();

			PreparedStatement ps2 =
			con.prepareStatement(
			"select * from pc where status1='FREE' limit 1");

			ResultSet rs2 = ps2.executeQuery();

			if(rs2.next())
			{
				String pcname = rs2.getString(2);

				PreparedStatement ps3 =
				con.prepareStatement(
				"select price from game where game_name=?");

				ps3.setString(1, game);

				ResultSet rs3 = ps3.executeQuery();

				int price = 0;

				if(rs3.next())
				{
					price = rs3.getInt(1);
				}

				int bill = price * hours;

				PreparedStatement ps4 =
				con.prepareStatement(
				"insert into booking(customer_name,pc_name,game_name,hours,bill) values(?,?,?,?,?)");

				ps4.setString(1, cname);
				ps4.setString(2, pcname);
				ps4.setString(3, game);
				ps4.setInt(4, hours);
				ps4.setInt(5, bill);

				ps4.executeUpdate();

				PreparedStatement ps5 =
				con.prepareStatement(
				"update pc set status1='BUSY' where pc_name=?");

				ps5.setString(1, pcname);

				ps5.executeUpdate();

				System.out.println("BOOKING SUCCESSFUL");
				System.out.println("PC ALLOTED: " + pcname);
				System.out.println("TOTAL BILL: " + bill);
			}

			else
			{
				System.out.println("NO FREE PC AVAILABLE");
			}

			con.close();

		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void viewBooking()
	{
		try {

			Connection con = DBConnection.getConnection();

			PreparedStatement ps =
			con.prepareStatement("select * from booking");

			ResultSet rs = ps.executeQuery();

			while(rs.next())
			{
				System.out.println(
						rs.getInt(1)+" "
						+ rs.getString(2)+" "
						+ rs.getString(3)+" "
						+ rs.getString(4)+" "
						+ rs.getInt(5)+" "
						+ rs.getInt(6));
			}

			con.close();

		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}