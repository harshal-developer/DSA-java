package Exerciess;

import java.util.Scanner;

public class StudentManagementSystem {
    static Student[] students = new Student[100]; // Array to store students
    static int studentCount = 0; // Keep track of the number of students

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            // Display menu options
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Update Student Details");
            System.out.println("4. Search Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    searchStudent(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the system...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Method to add a student
    public static void addStudent(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Grade: ");
        String grade = scanner.nextLine();

        students[studentCount] = new Student(id, name, grade);
        studentCount++;

        System.out.println("Student added successfully!");
    }

    // Method to display all students
    public static void displayAllStudents() {
        if (studentCount == 0) {
            System.out.println("No students available.");
        } else {
            for (int i = 0; i < studentCount; i++) {
                students[i].displayStudentInfo();
            }
        }
    }

    // Method to update student details (name or grade)
    public static void updateStudent(Scanner scanner) {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        boolean studentFound = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].id == id) {
                studentFound = true;

                System.out.println("1. Update Name");
                System.out.println("2. Update Grade");
                System.out.print("Enter your choice: ");
                int updateChoice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (updateChoice) {
                    case 1:
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        students[i].updateName(newName);
                        System.out.println("Name updated successfully.");
                        break;
                    case 2:
                        System.out.print("Enter new grade: ");
                        String newGrade = scanner.nextLine();
                        students[i].updateGrade(newGrade);
                        System.out.println("Grade updated successfully.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                break;
            }
        }

        if (!studentFound) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    // Method to search for a student by name
    public static void searchStudent(Scanner scanner) {
        System.out.print("Enter Student Name to search: ");
        String name = scanner.nextLine();

        boolean studentFound = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].name.equalsIgnoreCase(name)) {
                students[i].displayStudentInfo();
                studentFound = true;
            }
        }

        if (!studentFound) {
            System.out.println("Student with the name " + name + " not found.");
        }
    }
}
