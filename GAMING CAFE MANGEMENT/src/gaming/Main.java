package gaming;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("=================================");
		System.out.println("     WELCOME TO GAMING CAFE");
		System.out.println("=================================");

		System.out.println();
		System.out.println("LOGIN TO CONTINUE");
		System.out.println();

		System.out.println("Username");
		String user = sc.nextLine();

		System.out.println("Password");
		String pass = sc.nextLine();

		if(!LoginService.login(user, pass))
		{
			System.out.println("Wrong Login");
			return;
		}

		System.out.println();
		System.out.println("LOGIN SUCCESSFUL");
		System.out.println("WELCOME ADMIN");
		System.out.println();

		while(true)
		{
			System.out.println("1 Customer Log");
			System.out.println("2 View Customer");
			System.out.println("3 Add Booking");
			System.out.println("4 View Booking");
			System.out.println("5 View PC Status");
			System.out.println("6 Exit");

			System.out.println();
			System.out.print("Enter Your Choice: ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch(choice)
			{
			case 1:
				CustomerService.addCustomer(sc);
				break;

			case 2:
				CustomerService.viewCustomer();
				break;

			case 3:
				BookingService.addBooking(sc);
				break;

			case 4:
				BookingService.viewBooking();
				break;

			case 5:
				PCService.viewPC();
				break;

			case 6:
				System.out.println();
				System.out.println("THANK YOU FOR VISITING GAMING CAFE");
				return;

			default:
				System.out.println("Invalid Choice");
			}

			System.out.println();
		}
	}
}