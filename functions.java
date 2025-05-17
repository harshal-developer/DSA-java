import java.util.Scanner;

public class functions {
    public static int PrintMyName(String name){
        int count = name.length();
        return count;
    }
    public static int sumHere(int a, int b){
        int sum = a + b;
        return sum;
    }
//    Factorial
    public static int calculateFactorial(int num){
        int fact = 1;
        for(int i = num; i >0 ; i--){
            fact = fact * i;
        }
//      System.out.println(fact);
        return fact;
    }

//    fibonacci series
    public static void getfibonacciseries(int a){
        int first = 0, second = 1;
        System.out.print("Fibonacci Series up to " + a + " terms: ");
        for (int i = 1; i <= a; i++) {
            System.out.print(first + " ");
            // Calculate the next term
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter any string: ");
//        String name = sc.next();
//        System.out.println(PrintMyName(name));

        System.out.println("enter a");
        int a = sc.nextInt();
//        System.out.println("enter b");
//        int b = sc.nextInt();
//        System.out.println("sum of a and b are :" + sumHere(a,b));
//        int b = calculateFactorial(a);
//        System.out.println(calculateFactorial(a)); //factorial
        getfibonacciseries(a);
    }
}