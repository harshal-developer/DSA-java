import java.util.Arrays;
import java.util.Scanner;

public class selection_Main {
    public static void main(String[] args){
//        find smallest number and swap it with the first ... repeat it further

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int[] sortedArr = selectionSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    private static int[] selectionSort(int[] arr){
//        find smallest element , get its index and swap the the i the element
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
