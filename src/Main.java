import java.util.ArrayList;
import java.util.Scanner;
import model.Student;

public class Main {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();

    int choice = 0;

    while (choice != 9) {

        System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Update Student");
        System.out.println("6. Sort Students by Marks");
        System.out.println("7. Sort Students by Name");
        System.out.println("8. View Students");
        System.out.println("9. Exit");

        System.out.print("Enter Choice: ");
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Department: ");
                String department = sc.nextLine();

                System.out.print("Enter Marks: ");
                double marks = sc.nextDouble();

                students.add(new Student(id, name, department, marks));
                System.out.println("Student Added Successfully!");
                break;

            case 2:
            case 8:

                if (students.isEmpty()) {
                    System.out.println("No Students Found!");
                } else {
                    for (Student student : students) {
                        System.out.println(student);
                        System.out.println("---------------------");
                    }
                }
                break;

            case 3:

                System.out.print("Enter Student ID to Search: ");
                int searchId = sc.nextInt();

                boolean found = false;

                for (Student student : students) {
                    if (student.getStudentId() == searchId) {
                        System.out.println("Student Found!");
                        System.out.println(student);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student Not Found!");
                }

                break;

            case 4:

                System.out.print("Enter Student ID to Delete: ");
                int deleteId = sc.nextInt();

                boolean deleted = false;

                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getStudentId() == deleteId) {
                        students.remove(i);
                        System.out.println("Student Deleted Successfully!");
                        deleted = true;
                        break;
                    }
                }

                if (!deleted) {
                    System.out.println("Student Not Found!");
                }

                break;

            case 5:

                System.out.print("Enter Student ID to Update: ");
                int updateId = sc.nextInt();
                sc.nextLine();

                boolean updated = false;

                for (Student student : students) {
                    if (student.getStudentId() == updateId) {

                        System.out.print("Enter New Name: ");
                        student.setName(sc.nextLine());

                        System.out.print("Enter New Department: ");
                        student.setDepartment(sc.nextLine());

                        System.out.print("Enter New Marks: ");
                        student.setMarks(sc.nextDouble());

                        System.out.println("Student Updated Successfully!");

                        updated = true;
                        break;
                    }
                }

                if (!updated) {
                    System.out.println("Student Not Found!");
                }

                break;

            case 6:

                students.sort((s1, s2) ->
                        Double.compare(s2.getMarks(), s1.getMarks()));

                System.out.println("Students Sorted By Marks!");
                break;

            case 7:

                students.sort((s1, s2) ->
                        s1.getName().compareToIgnoreCase(s2.getName()));

                System.out.println("Students Sorted By Name!");
                break;

            case 9:

                System.out.println("Thank You!");
                break;

            default:

                System.out.println("Invalid Choice!");
        }
    }

    sc.close();
}

}
