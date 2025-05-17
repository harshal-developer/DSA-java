import java.util.Arrays;
import java.util.Scanner;

public class insertion_Main {
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
    }
    private static void insertionSort(int[] arr){
//        Main code
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

//        My Code : code looks like a bubble sort but its insertion sort
//        for(int i = 0; i < arr.length - 1; i++){
//            for(int j = i + 1; j > 0; j--){
//                if(arr[j] < arr[j - 1]){
//                    int temp = arr[j -1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = temp;
//                }else{
//                    break;
//                }
//            }
//        }
        System.out.println(Arrays.toString(arr));
    }
}
