package gaming;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PCService {

	public static void viewPC()
	{
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps =
			con.prepareStatement("select * from pc");
			ResultSet rs = ps.executeQuery();
			System.out.println("PC STATUS");
			while(rs.next())
			{
				System.out.println(
						rs.getString(2)+" "
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