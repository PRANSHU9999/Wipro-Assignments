package sample_package;

public class Emp {

	int id,age;
	String name;
	static String companyname="Wipro";
	double salary;
	
	
	void department(int dptid,String dptname)
	{
		System.out.println("companyname="+companyname);
		System.out.println("Department id="+dptid);
		System.out.println("Department name="+dptname);
	}
	
	void team(int teamid,String teamname)
	{
		System.out.println("companyname="+companyname);
		System.out.println("Team id="+teamid);
		System.out.println("Team name="+teamname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp=new Emp();
		emp.department(101,"Development");
		emp.team(1001,"Asura");
	}

}
