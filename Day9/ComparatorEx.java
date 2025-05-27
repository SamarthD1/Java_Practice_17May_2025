package Day9;

import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }
}

// Comparator to sort by name
class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

// Comparator to sort by marks (descending)
class MarksDescendingComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.marks - s1.marks;
    }
}

public class ComparatorEx {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Arjun", 85));
        list.add(new Student(2, "Raj", 75));
        list.add(new Student(3, "Rohan", 95));

        System.out.println("Sorted by Name:");
        Collections.sort(list, new NameComparator());
        for (Student s : list) {
            System.out.println(s);
        }

        System.out.println("\nSorted by Marks (Descending):");
        Collections.sort(list, new MarksDescendingComparator());
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
