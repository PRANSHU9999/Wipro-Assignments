package control_session;
import java.util.Scanner;
public class sum_of_n_natural_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Write the number");
		int num=sc.nextInt();
		int sum=0;
		System.out.println("sum of numbers till "+num+" is");
		while(num>0)
		{	sum+=num;
			num--;
		}
		System.out.println(sum);
	}

}
