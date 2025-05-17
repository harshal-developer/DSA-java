import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of queries");
        int q = sc.nextInt();  // Number of queries

        while (q-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int sum = a;
            for (int i = 0; i < n; i++) {
                sum += (int) Math.pow(2, i) * b; // Add power of 2 * b
                System.out.print(sum + " "); // Print result
            }
            System.out.println(); // Move to next line for next query
        }
        sc.close();
    }
}