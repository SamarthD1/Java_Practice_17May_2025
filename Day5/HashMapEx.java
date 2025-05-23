package Day5;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        // 1. Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // 2. Adding key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Mango", 30);
        map.put("Orange", 40);

        // 3. Display the map
        System.out.println("HashMap: " + map);

        // 4. Accessing a value by key
        System.out.println("Value for key 'Mango': " + map.get("Mango"));

        // 5. Updating a value
        map.put("Banana", 25); // overwrite existing value
        System.out.println("After updating 'Banana': " + map);

        // 6. Removing a key-value pair
        map.remove("Apple");
        System.out.println("After removing 'Apple': " + map);

        // 7. Checking if a key or value exists
        System.out.println("Contains key 'Mango'? " + map.containsKey("Mango"));
        System.out.println("Contains value 40? " + map.containsValue(40));

        // 8. Iterating over keys and values
        System.out.println("Iterating over keys and values:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 9. Size and clearing
        System.out.println("Size of HashMap: " + map.size());
        map.clear();
        System.out.println("After clearing: " + map);
    }
}
