package encapsulation_practice;
class patient
{
	private String patientname;
	public int patientid;
	int age;
	protected String disease;
	
	public String getpatientname() 
	{
	return patientname;	
	}
	
	public void setpatientname(String patientname)
	{
		this.patientname=patientname;
	}
	
	public void showdetails()
	{
		 System.out.println("Patient name is "+patientname);
		 System.out.println("patient ID is"+patientid);
		 System.out.println("Age is "+age);
		 System.out.println("Disease is "+disease);
		 
	}
}
public class example_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
