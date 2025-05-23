package Day5;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapEx {
    public static void main(String[] args) {
        // 1. Creating a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // 2. Adding key-value pairs
        map.put(3, "C");
        map.put(1, "A");
        map.put(4, "D");
        map.put(2, "B");

        // 3. Display the TreeMap (will be sorted by keys)
        System.out.println("TreeMap: " + map);

        // 4. Accessing values
        System.out.println("Value for key 2: " + map.get(2));

        // 5. Removing a key
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // 6. First and last keys
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());

        // 7. Submaps
        System.out.println("SubMap (keys 1 to 3): " + map.subMap(1, 4)); // 4 is exclusive

        // 8. Iterating through entries
        System.out.println("Iterating over TreeMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 9. Size and clearing
        System.out.println("Size of TreeMap: " + map.size());
        map.clear();
        System.out.println("After clearing: " + map);
    }
}
