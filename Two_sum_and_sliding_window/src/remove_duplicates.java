import java.util.Arrays;
import java.util.Scanner;

public class remove_duplicates {
    public static int removeDuplicates(int[] arr){
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
                //unique elements go to the front, after that other elements at the end as it is
            }
        }
        return i + 1;
    }
    public static void main(String[] args){
        System.out.println("Enter integers : ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int newSize = removeDuplicates(arr);
        for(int i = 0; i < newSize; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
