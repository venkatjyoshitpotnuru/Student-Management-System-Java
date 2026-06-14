package model;

public class Student {
    private int studentId;
    private String name;
    private String department;
    private double marks;

    public Student(int studentId, String name, String department, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
                "\nName: " + name +
                "\nDepartment: " + department +
                "\nMarks: " + marks;
    }
}