package Wrapper_practice;
import java.util.*;
public class queue_practive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Queue<String> q = new PriorityQueue<String>();
        // creating a PriorityQueue using Queue interface

        q.add("Dahod");       
        // adds element to queue

        q.add("Chennai");     
        q.add("Mumbai");      
        q.add("Pune");        
        q.add("Bhopal");      
        q.add("Ahemadabad");  

        System.out.println(q);  
        // prints queue (NOT in insertion order, but priority order)

        q.remove();  
        // removes the highest priority element (smallest alphabetically)

        System.out.println(q);

        q.remove();  
        // removes next highest priority element

        System.out.println(q);

        q.remove("Mumbai");  
        // removes specific element "Mumbai" if present

        System.out.println(q);

        System.out.println(q.offer("Alpha"));  
        // adds element, returns true if successful

        System.out.println(q);

        System.out.println(q.peek());  
        // shows top element WITHOUT removing it

        System.out.println(q.poll());  
        // retrieves AND removes top element
	}

}
