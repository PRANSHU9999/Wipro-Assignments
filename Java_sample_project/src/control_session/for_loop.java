package control_session;
import java.util.Scanner;
public class for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
	
		}
		System.out.println(sum);
	}

}
