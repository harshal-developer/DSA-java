package Exerciess;

import java.util.Scanner;

public class grate_switch {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a numerical grade
        System.out.print("Enter a numerical grade (0-100): ");
        int grade = scanner.nextInt();

        // Ensure that the grade is within the valid range
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
        } else {
            // Determine the letter grade using a switch statement
            String letterGrade;
            switch (grade / 10) { // Use integer division to group grades
                case 10:
                case 9:
                    letterGrade = "A";
                    break;
                case 8:
                    letterGrade = "B";
                    break;
                case 7:
                    letterGrade = "C";
                    break;
                case 6:
                    letterGrade = "D";
                    break;
                default:
                    letterGrade = "F";
                    break;
            }

            // Print the corresponding letter grade
            System.out.println("Your grade is: " + letterGrade);
        }

        // Close the scanner
        scanner.close();
    }
}
