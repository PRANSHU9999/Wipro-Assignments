package gaming;

public class LoginService {

	public static boolean login(String user,String pass)
	{
		if(user.equals("admin") && pass.equals("1234"))
		{
			return true;
		}

		return false;
	}
}