package Exception_handling;
import java.util.Scanner;
public class throws_keyword {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		//throw new ArithmeticException("Arithmetic exception");-generates an exception by intentiion
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter divident");//120
		int a=sc.nextInt();
		System.out.println("Enter divisor");//120
		int b=sc.nextInt();
	    Thread.sleep(100);
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
		{
			System.out.println("pass the level");
		}
System.out.println("End");
	}

}




 
