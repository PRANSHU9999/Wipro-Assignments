package class_method;
import java.util.Scanner;
public class Hospital_function_overloading {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		int i=sc.nextInt();
		int ans=i%2;
		switch(ans)
		{
		case 0:System.out.println("Even");
		break;
		
		case 1:System.out.println("Odd");
		break;
		default:System.out.println("Invalid");
		}
	}

}
