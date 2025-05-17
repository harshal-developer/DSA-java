import java.util.Scanner;

public class BMI_Calculator {
//
//    static int age;
//    static int weight;
//    static int height;
//
//    static {
//        Scanner sc = new Scanner(System.in);
////        different age grps : children , adults and olders
//        System.out.println("Enter you age");
//        age = sc.nextInt();
//        System.out.println("Enter you weight");
//        weight = sc.nextInt();
//        System.out.println("Please enter a height in CM");
//        height = sc.nextInt();
//    }

    static double calculateBMIIndex(double weight, double height) {
        double heightinm = height / 100;
        return weight / (heightinm * heightinm);
    }

    public static void main(String[] args) {
        System.out.println("**************************");
        System.out.println("Welcome to BMI CALCULATOR");
        System.out.println("**************************");

        Scanner sc = new Scanner(System.in);
//        different age grps : children , adults and olders
        System.out.println("Enter you age");
        int age = sc.nextInt();

        double weight = 0;
    
        System.out.println("Do you want enter the kg or pound (enter your choice kg / pound)");
        String choice = sc.next();
        switch (choice.toLowerCase()){
            case "pound" :
                System.out.println("Enter the weight in pounds : ");
                double pound = sc.nextDouble();
                weight = pound * 0.45;
                CalculateBMI(age, weight);
                break;
            case "kg" :
                System.out.println("Enter the weight in kg : ");
                weight = sc.nextDouble();
                CalculateBMI(age, weight);
                break;
            default:
                System.out.println("invalid choice");
                break;
        }

    }
    static void CalculateBMI(int age, double weight){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a height in CM");
        int height = sc.nextInt();

//        we can use while for infinite calling

        if (age >= 2 && age <= 120) {
            double bmi = calculateBMIIndex(weight, height);
            if (bmi < 18.5) {
                System.out.println("****************");
                System.out.println("For age : " + age + " years with " + height + " cm height.");
                System.out.println("Hey......your BMI is : " + bmi);
                System.out.println("Underweight");
                System.out.println("****************");
            } else if (bmi > 18.5 && bmi <= 24.9) {
                System.out.println("****************");
                System.out.println("For age : " + age + " years with " + height + " cm height.");
                System.out.println("Hey......your BMI is : " + bmi);
                System.out.println("Healthy weight");
                System.out.println("****************");
            } else if (bmi > 25 && bmi <= 29.9) {
                System.out.println("****************");
                System.out.println("For age : " + age + " years with " + height + " cm height.");
                System.out.println("Hey......your BMI is : " + bmi);
                System.out.println("Overweight");
                System.out.println("****************");
            } else {
                System.out.println("****************");
                System.out.println("For age : " + age + " years with " + height + " cm height.");
                System.out.println("Hey......your BMI is : " + bmi);
                System.out.println("Obesity");
                System.out.println("****************");
            }
        } else {
            System.out.println("please enter age in the range 2 and 120....");
        }
    }
}
