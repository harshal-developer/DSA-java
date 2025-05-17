import java.util.Objects;
import java.util.Scanner;

public class datatype_check {
    public static void main(String[] args){
        int a = 30;
        if(a >= Integer.MIN_VALUE && a <= Integer.MAX_VALUE )
            System.out.println("Interger");
        else
            System.out.println("not interger");
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt(); // Number of test cases
//
//        for (int i = 0; i < t; i++) {
//            try {
//                long n = sc.nextLong(); // Read input as long
//
//                System.out.println(n + " can be fitted in:");
//                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
//                    System.out.println("* byte");
//                }
//                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
//                    System.out.println("* short");
//                }
//                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
//                    System.out.println("* int");
//                }
//                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
//                    System.out.println("* long");
//                }
//            } catch (Exception e) {
//                System.out.println(sc.next() + " can't be fitted anywhere.");
//            }
//        }
//        sc.close();
    }
}
