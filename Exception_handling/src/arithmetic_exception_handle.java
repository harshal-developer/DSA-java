import jdk.jfr.StackTrace;

import java.util.Scanner;

public class arithmetic_exception_handle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int c = a / b;
            System.out.println(c);
        }catch (ArithmeticException e){
//            We can write RuntimeException or Exception also because they extend to ArithmeticException
//            System.out.println(e);
            StackTraceElement[] stackTrace = e.getStackTrace();
            for(int i = 0 ; i < stackTrace.length; i++){
                System.out.println(stackTrace[i]);
            }
            System.out.println("proceed");
        }
        System.out.println("Execution completed");
    }
}
