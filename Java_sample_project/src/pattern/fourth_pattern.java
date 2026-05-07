package pattern;

public class fourth_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=row-i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
