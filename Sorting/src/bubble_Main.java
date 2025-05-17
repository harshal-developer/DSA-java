import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class bubble_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the numbers five numbers : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorting in progress : ");
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr){
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++ ){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
//                    extras
                    counter++ ; //count how many swaps
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
