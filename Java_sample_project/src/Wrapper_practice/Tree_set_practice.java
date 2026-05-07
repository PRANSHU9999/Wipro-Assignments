package Wrapper_practice;
import java.util.*;
//elements store on the basis of hash code value
//follow ascending order
//single null not allowed
//duplicate not allowed
public class Tree_set_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<String> set = new TreeSet<String>();
	        set.add("Orange");
	        set.add("Mango");
	        set.add("Kiwi");
	        set.add("Apple");
	        set.add("Apple");

	        // set.add(null);
	        // set.add(null);

	        System.out.println(set);
	        System.out.println(set.equals("Orange")); // false

	        set.remove("Kiwi");
	        System.out.println(set);

	        // System.out.println();

	        Iterator<String> itr = set.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }
	}

}
