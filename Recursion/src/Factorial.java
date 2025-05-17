import java.util.Scanner;

public class Factorial {
    static int factorial(int no){
        if(no == 0 || no == 1){
            return 1;
        }

        return no * factorial(no - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int no = sc.nextInt();
        System.out.println("Factorial of " + no + " is : " + factorial(no));
    }
}
