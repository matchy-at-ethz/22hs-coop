package coop;

import java.util.*;

public class task5 {
    public static String concatenate (List<?> list) {
        String result = "";
        String separator = "";

        if (list instanceof List<String>) {
            result = "String:";
            separator = " ";
        }
        else if (list instanceof List<Integer>) {
            result = "Integers:";
            separator = "+";
        }

        for (Object el : list)
            result = result + separator + el.toString();
        return result;
    }

    public void main (String[] args) {
        List<String> l = new LinkedList<String>();
        l.add("foo"); l.add("bar"); l.add("foobar");
        concatenate(l);
    }
}
