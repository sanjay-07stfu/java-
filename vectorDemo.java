import java.util.*;

public class VectorDemo {
    public static void main(String args[]) {
        // Initialize a Vector that can hold any type of object (use Object as the type)
        Vector<Object> v = new Vector<>();

        // Autoboxing: You don't need `new Integer(1)` or `new Float(12.0)`, but I'll use them here to keep your approach.
        Integer s1 = new Integer(1);
        Integer s2 = new Integer(2);
        String s3 = new String("sanjay");
        String s4 = new String("keshav");
        Float s5 = new Float(12.0f); // Note the `f` to indicate it's a float
        Float s6 = new Float(14.0f);

        // Add elements to the Vector
        v.addElement(s1);
        v.addElement(s2);
        v.addElement(s3);
        v.addElement(s4);
        v.addElement(s5);
        v.addElement(s6);

        // Remove element at index 2 ("sanjay")
        v.removeElementAt(2);

        // Print the content of the vector
        System.out.println(v);
    }
}
