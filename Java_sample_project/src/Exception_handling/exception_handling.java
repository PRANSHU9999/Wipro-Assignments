package Exception_handling;

import java.util.Scanner;

public class exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		int b=88;
		try
		{
			int c=b/a;
			System.out.println("Division="+c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("End");
	}

}
