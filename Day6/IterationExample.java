package Day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationExample {
    public static void main(String[] args) {
        // Creating a list of names
        List<String> names = new ArrayList<>();
        names.add("Sam");
        names.add("Raj");
        names.add("Ritesh");
        names.add("Ankit");

        //1. For-each loop
        System.out.println("Using for-each loop:");
        for (String name : names) {
            System.out.println(name);
        }

        //2. Using Iterator 
        System.out.println("\nUsing Iterator:");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
    }
}

