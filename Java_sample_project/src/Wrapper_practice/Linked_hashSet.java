package Wrapper_practice;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class Linked_hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new LinkedHashSet<String>();
		
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
	        Iterator<String> itr=set.iterator();
	        while(itr.hasNext())
	        {
	        	System.out.println(itr.next());
	        }
	}
}
