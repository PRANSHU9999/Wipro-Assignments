package inheritance_practice;
class Vehicle
{
	void nooftyre()
	{
		System.out.println("any");
	}
	void type()
	{
		System.out.println("any");
	}
}

class Scooter extends Vehicle
{
	void nooftyre()
	{
		System.out.println("2");
	}
	void type()
	{
		System.out.println("petrol");
	}
}

class Car extends Vehicle
{
	void nooftyre()
	{
		System.out.println("4");
	}
	void type()
	{
		System.out.println("EV");
	}
}
public class Polytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vh=new Vehicle();
		Scooter sc=new Scooter();
		vh.type();
		sc.nooftyre();
	}

}
