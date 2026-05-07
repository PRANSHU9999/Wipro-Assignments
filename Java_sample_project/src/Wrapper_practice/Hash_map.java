package Wrapper_practice;
import java.util.*;
public class Hash_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Creating a HashMap (key = String, value = Integer)
        Map<String,Integer> map = new HashMap<String,Integer>();

        // put(key, value) -> adds or updates value for a key
        map.put("One",1);     
        map.put("Ten",10);
        map.put("Nine",9);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Other",10);

        // HashMap allows ONE null key and multiple null values
        map.put(null, null);   // adds null key with null value
        map.put(null, 3);      // replaces previous null value → now null = 3

        // print map (unordered)
        System.out.println(map);

        // containsKey(key) -> checks if key exists (case-sensitive)
        System.out.println(map.containsKey("nine")); // false (because "Nine" ≠ "nine")

        // containsValue(value) -> checks if value exists
        System.out.println(map.containsValue(9)); // true

        // replace(key, oldValue, newValue)
        // replaces ONLY if key exists AND oldValue matches
        map.replace("Other",10,11);  // 10 → 11

        System.out.println(map);

        // get(key) -> returns value of key (null if not found)
        System.out.println(map.get("Nine")); // returns 9

        System.out.println();
	}

}
