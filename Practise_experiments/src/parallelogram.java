import java.util.Scanner;

public class parallelogram {
    static int B, H;  // Static variables for breadth and height
    static boolean flag;  // Static flag to check conditions

    // Static Initialization Block
    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();

        if (B > 0 && H > 0) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            System.out.println(B * H); // Print the area if valid
        }
    }
}
