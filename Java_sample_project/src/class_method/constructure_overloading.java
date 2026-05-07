package class_method;

public class constructure_overloading {
	 Vehicle() {
	        System.out.println("Default constructor");
	    }

	 constructure_overloading(String name) {
	        System.out.println(name);
	    }

	 constructure_overloading(String name, String type) {
	        System.out.println(name);
	        System.out.println(type);
	    }
	public static void main(String[] args) {
		// TODO Auto-ge
		constructure_overloading vc = new constructure_overloading("Baleno car");
		        System.out.println("********************");
		        constructure_overloading vc1 = new constructure_overloading("Baleno car", "Petrol car");
		    
	}

}
