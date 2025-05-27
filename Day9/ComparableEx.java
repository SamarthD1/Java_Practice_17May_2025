package Day9;

import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Natural ordering: compare by marks
    public int compareTo(Student s) {
        return this.marks - s.marks;
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class ComparableEx {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Arjun", 85));
        list.add(new Student(2, "Raj", 75));
        list.add(new Student(3, "Rohan", 95));

        Collections.sort(list); // Uses compareTo

        for (Student s : list) {
            System.out.println(s);
        }
    }
}
