package class_method;

class Hospital
{
	String hospital_name="SundarLalHospital";
	String location="Mumbai";
	
	void details()
	{
		 System.out.println("Hospital: " + hospital_name);
	        System.out.println("Location: " + location);
	}
}

class doctor extends Hospital
{
	String doc_name="Dr.Rai";
	String specialization="bone specialist";
	
	 void doctorDetails() {
	        System.out.println("Doctor: " + doc_name);
	        System.out.println("Specialization: " + specialization);
	    }
}
public class doc_hos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doctor d=new doctor();
		
		d.details();
		d.doctorDetails();
	}

}
