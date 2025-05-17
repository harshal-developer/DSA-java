import java.util.Arrays;
import java.util.Scanner;

public class first_And_Last_occurance {
    public static int[] searchRange(int[] arr, int target){
        int leftIndex = searchInLeft(arr, target);
        int RightIndex = searchInRight(arr, target);

        return new int[]{leftIndex, RightIndex};
    }

    public static int searchInLeft(int [] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(target == arr[mid]){
                result = mid;
                high = mid - 1; //so it then search for the left side
            }else if(target > arr[mid]){ // now for this eg : i am using asc arr
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return result;
    }

    public static int searchInRight(int [] arr, int target){
        int low = 0 ;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(target == arr[mid]){
                result = mid;
                low = mid + 1;
            }else if(target > arr[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("Enter any array : ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter your target : ");
        int target = sc.nextInt();
        int[] search = searchRange(arr, target);
        for(int output : search){
            System.out.println(output);
        }
    }
}
