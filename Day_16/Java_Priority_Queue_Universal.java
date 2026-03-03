import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Collections;
class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() { return id; }
    public String getName() { return name; }
    public double getCGPA() { return cgpa; }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        // En az 1 kapasite ile baslatip Comparator ekliyoruz
        int initialCapacity = events.size() > 0 ? events.size() : 11;
        
        PriorityQueue<Student> pq = new PriorityQueue<Student>(initialCapacity, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // 1. CGPA (Descending)
                if (s1.getCGPA() != s2.getCGPA()) {
                    return s2.getCGPA() > s1.getCGPA() ? 1 : -1;
                }
                // 2. Name (Ascending)
                if (!s1.getName().equals(s2.getName())) {
                    return s1.getName().compareTo(s2.getName());
                }
                // 3. ID (Ascending)
                return s1.getID() < s2.getID() ? -1 : 1;
            }
        });

        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                pq.add(new Student(id, name, cgpa));
            } else if (parts[0].equals("SERVED")) {
                pq.poll();
            }
        }

        List<Student> result = new ArrayList<Student>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        return result;
    }
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
