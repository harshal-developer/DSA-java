package Exerciess;

public class Student {
    String name;
    int id;
    String grade;

    // Constructor to initialize student data
    public Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Grade: " + grade);
        System.out.println("---------------------------");
    }

    // Update grade method
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
    }

    // Update name method
    public void updateName(String newName) {
        this.name = newName;
    }
}
