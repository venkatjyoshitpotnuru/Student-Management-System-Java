import java.util.ArrayList;
import java.util.Scanner;
import model.Student;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice = 0;
        while (choice != 3) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
         
            String department = sc.nextLine();
                System.out.print("Enter Marks: ");
                double marks = sc.nextDouble();
                students.add(new Student(id, name, department, marks));
                System.out.println("Student Added Successfully!");
            }
            else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("No Students Found!");
                } else {
                    for (Student student : students) {
                        System.out.println(student);
                        System.out.println("---------------------");
                    }
                }
            }
            else if (choice == 3) {
                System.out.println("Thank You!");
            }
            else {
                System.out.println("Invalid Choice!");
            }
        }
        sc.close();
    }
}