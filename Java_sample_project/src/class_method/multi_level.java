package class_method;
class Grandparent
{
	void openland()
	{
		System.out.println("Openland for commercial use");
	}
}
class Parent extends Grandparent
{
	void flat()
	{
		System.out.println("2BHK");
	}
	void car()
	{
		System.out.println("BAleno Petrol car");
	}
}
class Child extends Parent
{
	void bike()
	{
		System.out.println("Pulsar");
	}
}
public class multi_level {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child mohan=new Child();
		mohan.flat();// self
		mohan.car();// parent
		mohan.bike();// parent
		mohan.openland();// grandparent
		
		Parent soham=new Parent();
		soham.flat();
		soham.car();
		//soham.bike();
	}

}

// Single inheritance= parent-->Child
//Multilevel inheritance= GrandParent-->Parent--> Child-->SubChild.......
// Hierarchical inheritance=Parent-->Child1-->Subchild1
//                                         -->Subchild2
//                               -->Child2
//                                -->Child3
 