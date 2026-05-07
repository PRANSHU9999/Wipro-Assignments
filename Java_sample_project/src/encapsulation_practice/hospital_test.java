package encapsulation_practice;
import encapsulation_practice.example_test;
public class hospital_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patient p=new patient();
		p.setpatientname("Pankaj");
		p.patientid=4564;
		p.age=44;
		p.disease="fever";
		
		p.showdetails();
		
	}

}
