package Exception_handling;
import java.util.Scanner;
public class try_catch_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter divident");//120
		int a=sc.nextInt();
		System.out.println("Enter divisor");//120
		int b=sc.nextInt();
		
		try
		{
			int c=a/b;//10/0
			System.out.println("Division is="+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{//finally will execute whether try catch run successfully or not
			System.out.println("imp code");
		}
System.out.println("End");
	}

}




