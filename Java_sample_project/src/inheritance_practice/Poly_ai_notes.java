package inheritance_practice;
class MathOp 
{  //method overloading
    void add(int a, int b)
    {
        System.out.println(a+b);
    }

    void add(int a, int b, int c)
    {
    	System.out.println(a+b+c);
    }
}

//Runtime (Method Overriding)

class Animal
{
    void sound() 
    {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal 
{
    void sound() 
    {
        System.out.println("Dog barks");
    }
}
public class Poly_ai_notes {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Polymorphism in Java 
		//1.Compile-time (Method Overloading)
		MathOp mo=new MathOp();
		Dog d=new Dog();
		
		mo.add(1,3,3);
		d.sound();
		
	}
}



