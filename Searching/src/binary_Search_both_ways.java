import java.util.Scanner;

public class binary_Search_both_ways {
    public static void main(String[] args){
        System.out.println("Enter any array : ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter your search key : ");
        int target = sc.nextInt();
        boolean result = iterativeBinarySearch(arr, target);
        boolean recursive_result = recursiveBinarySearch(arr, target, 0, arr.length - 1);

        if(result && recursive_result){
            System.out.println(target + " is found ");
        }else{
            System.out.println(target + " not found");
        }
    }

    public static boolean recursiveBinarySearch(int[] arr, int target, int low , int high){
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(target == arr[mid]){
                return true;
            }

            if(target < arr[mid])
                return recursiveBinarySearch(arr, target, mid + 1, arr.length - 1);
            return recursiveBinarySearch(arr, target, low, mid - 1 );
        }
        return false;
    }

    public static boolean iterativeBinarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(target == arr[mid]){
                return true;
            }else if(target < arr[mid]){ //    for DESC sorted array
//                else if(target > arr[mid]){ // for ASC sorted array
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return false;
    }
}
