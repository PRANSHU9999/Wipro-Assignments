package Wrapper_practice;
import java.util.*;

public class Hash_set_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		 set.add("Orange");
	        set.add("Mango");
	        set.add("Kiwi");
	        set.add("Apple");
	        set.add("Apple");
	        set.add(null);
	        set.add(null);
	        System.out.println(set);
	        System.out.println(set.equals("Orange")); // false

	        set.remove("Kiwi");
	        System.out.println(set);
	}

}
