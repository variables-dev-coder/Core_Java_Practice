package day48_Collection_Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
    public static void main(String[] args) {
        // Map: StudentName → Marks
        Map<String, Integer> marksMap = new HashMap<>();

        // Adding students
        marksMap.put("Alice", 85);
        marksMap.put("Bob", 92);
        marksMap.put("Charlie", 78);
        marksMap.put("David", 90);

        // Print all students with marks
        System.out.println("Student Marks:");
        for (Map.Entry<String, Integer> entry : marksMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Search for a student's marks
        String searchStudent = "Bob";
        System.out.println("\nMarks of " + searchStudent + ": " + marksMap.get(searchStudent));

        // Update marks
        marksMap.put("Charlie", 82);
        System.out.println("\nAfter updating Charlie's marks:");
        System.out.println(marksMap);

        // Find topper (highest marks)
        String topper = "";
        int maxMarks = -1;
        for (Map.Entry<String, Integer> entry : marksMap.entrySet()) {
            if (entry.getValue() > maxMarks) {
                maxMarks = entry.getValue();
                topper = entry.getKey();
            }
        }
        System.out.println("\nTopper: " + topper + " → " + maxMarks);
    }
}

/*
Logic:

Use HashMap<String, Integer> → Key = Student Name, Value = Marks.
Perform operations:
    Add student and marks
    Search marks by student name
    Update marks
    Find topper (highest marks)


Student Marks:
Alice → 85
Bob → 92
Charlie → 78
David → 90

Marks of Bob: 92

After updating Charlie's marks:
{Alice=85, Bob=92, Charlie=82, David=90}

Topper: Bob → 92

 */