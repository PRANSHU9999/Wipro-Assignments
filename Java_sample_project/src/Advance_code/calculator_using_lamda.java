package Advance_code;
interface Calculator
{
	int op(int a,int b);
}
public class calculator_using_lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator add=(a,b)->a+b;
		Calculator sub=(a,b)->a-b;
		Calculator mul=(a,b)->a*b;
		Calculator div=(a,b)->a/b;
		
		int a=410;
		int b=44;
		System.out.println("Addition is "+add.op(a,b));
		System.out.println("Substraction is "+sub.op(a,b));
		System.out.println("Multiplication is "+mul.op(a,b));
		System.out.println("Division is "+div.op(a,b));	}

}
