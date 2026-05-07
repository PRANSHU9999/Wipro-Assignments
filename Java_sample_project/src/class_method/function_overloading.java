package class_method;

public class function_overloading {

	void details(int rollno, String name)
	{
		System.out.println("Rollno ="+rollno);
		System.out.println("name ="+name);
	}
	void details(String name,int rollno )
	{
		System.out.println("name ="+name);
		System.out.println("Rollno ="+rollno);
		
	}
	void details(int rollno ,String name, int age)
	{
		System.out.println("Rollno ="+rollno);
		System.out.println("name ="+name);
		System.out.println("Age ="+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function_overloading student=new function_overloading();
				student.details(101, "Nisha", 20);
	}

}
