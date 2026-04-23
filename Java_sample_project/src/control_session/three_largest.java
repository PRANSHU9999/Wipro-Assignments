package control_session;

public class three_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9,b=3,c=5;
		
		if(a>b)
		{
			if(a>c) System.out.println("a is largest");
			else 
			{
				System.out.println("c is largest");
			}
		}
		else {
            if(b>c) 
            {
                System.out.println("b is largest");
            } 
            else 
            {
                System.out.println("c is largest");
            }
	}
};
}
