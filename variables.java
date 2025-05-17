import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        // Handling overflow of byte when assigning 500
        byte a = (byte) 500;  // 500 / 256 = 244; 244 - 256 = -12
//        System.out.println("Value of byte a: " + a);  // Output

        // Initial array with some default values
        int[] arr = new int[]{4, 5, 5, 4, 3};

        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements for the array:");

        // Reading values into the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();  // Input value for each array element
        }

        // Printing the updated array values
        System.out.println("Updated array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

        // Closing the Scanner object to release resources
        sc.close();
    }
}
