package inheritance_practice;
interface Hospital
{
	void infra();
	void degree();
	default void doc()
	{
		System.out.println("Hello");
	}
}
class Doctor implements Hospital
{
	public void infra()
	{
		System.out.println("Ots,wards,doctor cabin");
	}
	public void degree()
	{
		System.out.println("MD Endo");
	}
	
}

class Nurse implements Hospital
{
	public void infra()
	{
		System.out.println("Ots,wards,nurse cabin,general area");
	}
	public void degree()
	{
		System.out.println("Nurse");
	}
}
public class Hospital_practice_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
