package Wrapper_practice;
import java.util.*;
public class Linked_list_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(9);   // adds 9 to list
		list.add(0);   // adds 0 to list
		list.add(8);   // adds 8 to list
		list.add(null); // adds null value (allowed in ArrayList)
		list.add(null); // adds another null
		list.add(8);   // adds duplicate value (duplicates allowed)

		System.out.println(list);  
		// prints full list → [9, 0, 8, null, null, 8]

		System.out.println(list.indexOf(8));  
		// returns first index of 8 → 2

		System.out.println(list.contains(9));  
		// checks if 9 exists → true

		System.out.println(list.isEmpty());  
		// checks if list is empty → false

		System.out.println(list.lastIndexOf(null));  
		// returns last index of null → 4

		System.out.println(list.get(2));  
		// returns element at index 2 → 8

		System.out.println(list.getFirst());  
		// returns first element → 9 (Java 21+)

		System.out.println(list.getLast());  
		// returns last element → 8 (Java 21+)

		list.set(2, 10);  
		// replaces element at index 2 with 10

		System.out.println(list);  
		// prints updated list → [9, 0, 10, null, null, 8]
		for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
		
        for(Integer val : list) {
            System.out.print(val + " ");
        }
        list.removeFirst();   // removes first
        list.removeLast();    // removes last
        list.remove(1);// removes index 1
        ListIterator<Integer> it=list.listIterator();
        Iterator<Integer> itr=list.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
		//System.out.println(list.reversed());  
		// returns reversed view of list → [8, null, null, 10, 0, 9]
	}

}
