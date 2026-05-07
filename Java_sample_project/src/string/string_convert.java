package string;

public class string_convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating StringBuffer with initial value "Hello "
        StringBuffer sb = new StringBuffer("Hello ");

        // Prints: Hello 
        System.out.println(sb);

        // This line is commented, so nothing happens here
        // sb.append(" Nisha");

        // Prints again: Hello  (no change because append is not executed)
        System.out.println(sb);

        // Prints capacity of StringBuffer
        // Default capacity = (initial string length + 16)
        // "Hello " length = 6 → 6 + 16 = 22
        System.out.println(sb.capacity());  // Output: 22

        // Prints current length of string
        // "Hello " has 6 characters
        System.out.println(sb.length());    // Output: 6

        // substring(3) → starts from index 3 to end
        // Index: H(0) e(1) l(2) l(3) o(4) ' '(5)
        // So output: "lo "
        System.out.println(sb.substring(3)); // Output: lo 

        // insert(5, " Nisha") → inserts at index 5
        // Before: "Hello "
        // After:  "Hello Nisha "
        System.out.println(sb.insert(5, " Nisha")); // Output: Hello Nisha 

	}

}
