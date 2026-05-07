package Keywords_practice;

class Animal
{
int x=100;
String name,type;
void eat(int x,String name,String type)
{
	  this.x = x; // refer current class variable

      this.name = name;

      this.type = type;

      System.out.println("X=  " + x);

      System.out.println("name=  " + name);

      System.out.println("type " + type);
}

void details() {

    this.eat(100, "Max", "Dog"); // refer current class method

   // control_session.Breakstate.eat(); // calling different class method
}

Animal() {

    //this(10);

    System.out.println("Default constructor");
}

Animal(int a) {

    this();
}
}
public class this_keyword_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animal a = new Animal(1);

	        a.details();
	}

}


