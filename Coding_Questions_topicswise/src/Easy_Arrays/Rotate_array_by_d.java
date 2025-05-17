package Easy_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_array_by_d {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many positions how want to shift the array to left : ");
        int position = sc.nextInt();
        for (int i = 0; i < position; i++) {
            // Left rotate the array by one position
            int first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }

        System.out.println(Arrays.toString(arr));
    }
}
