package Easy_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class reverse_Array_in_groups {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the split : ");
        int split = sc.nextInt();
        for(int i = 0; i < arr.length; i = i + split){
            int left = i;
            int right = Math.min(i + split - 1, arr.length - 1);
            while (left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
