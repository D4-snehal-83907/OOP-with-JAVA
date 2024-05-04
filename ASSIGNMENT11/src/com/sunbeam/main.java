import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display all students sorted on roll no");
            System.out.println("3. Display all students sorted on name");
            System.out.println("4. Display all students sorted on marks in descending order");
            System.out.println("5. Display all students sorted on course in Java");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int rollno = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Marks: ");
                    int marks = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();
                    students.add(new Student(rollno, name, marks, course));
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    Collections.sort(students);
                    displayStudents(students);
                    break;
                case 3:
                    students.sort(Comparator.comparing(Student::getName));
                    displayStudents(students);
                    break;
                case 4:
                    students.sort(Comparator.comparing(Student::getMarks).reversed());
                    displayStudents(students);
                    break;
                case 5:
                    students.sort(Comparator.comparing(Student::getCourse)
                            .thenComparing(Student::getRollno));
                    displayStudents(students);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }

    private static void displayStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
