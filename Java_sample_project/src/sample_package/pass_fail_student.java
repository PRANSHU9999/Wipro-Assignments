package sample_package;

public class pass_fail_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float per=85.6f;
		
		if(per>100|| per<0) System.out.println("Invalid input: Please enter the value between 100 and 0");
		else if(per>=75)
		{
			
			System.out.println("Dist");
			if(per>=95)
			{
				 System.out.println("A++");
			}
			else if(per>=85)
			{
				 System.out.println("A+");
			}
		}
		else if(per>=60 && per<75) System.out.println("First class");
		else if(per>=50 && per<60) System.out.println("second class");
		else if(per>=40 && per<50) System.out.println("pass");
		else System.out.println("Fail");
	}

}
