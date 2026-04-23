package control_session;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String s=sc.next();
		
		switch(s)
		{
		case "+":System.out.println(a+b);
		break;
		case "-":System.out.println(a-b);
		break;
		case "*":System.out.println(a*b);
		break;
		case "/":
		if(b!=0)
		{
			System.out.println(a/b);
		}
		else
		{
			System.out.println("denominator can not be 0");
		}
		break;
		default: System.out.println("Invalid operator");
		}
	}

}
