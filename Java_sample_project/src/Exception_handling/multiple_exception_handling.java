package Exception_handling;

import java.util.Scanner;

public class multiple_exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		int b=88;
		try
		{
			//null pointer exception
			String str=null;
			System.out.println(str.charAt(1));
			//arithmetic exception
			int c=b/a;
			System.out.println("Division="+c);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		/*
		 or you can use parent exception class i.e exception
		 catch(ArithmeticException e)
		{
			System.out.println(e);
		} 
		  
		
		 */
		 
		System.out.println("End");
	}

}
