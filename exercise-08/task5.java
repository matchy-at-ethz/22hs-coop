
import java.util.*;

public class task5 {
    public static String concatenate (List<?> list) {
    // or maybe   String concatenate (List<?> list, Class<?> c) { ... }
    // REFLECTIOOOOONNNN
    // c is an Object that tells you the runtime type info
        String result = "";
        String separator = "";

        if (list instanceof List<?>) {
            result = "String:";
            separator = " ";
        }
        else if (list instanceof List<?>) {
            result = "Integers:";
            separator = "+";
        }

        for (Object el : list)
            result = result + separator + el.toString();
        return result;
    }

    public static void main (String[] args) {
        List<String> l1 = new LinkedList<String>();
        l1.add("word");
        List<Integer> l2 = new LinkedList<Integer>();
        l2.add(1);
        List<Object> l3 = new LinkedList<Object>();
        l3.add(new Object());
        System.out.println(concatenate(l1));
        System.out.println(concatenate(l2));
        System.out.println(concatenate(l3));
    }
}
