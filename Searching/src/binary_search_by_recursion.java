import java.util.Scanner;

public class binary_search_by_recursion {
    public static void main(String[] args) {
        System.out.println("Enter any array : ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = arr.length - 1;
        System.out.println("Enter you target : ");
        int target = sc.nextInt();
        int result = performBinarySearchByRecursion(arr, target, low, high);

        if(result != -1){
            System.out.println(target + " found at index : "+ result);
        }else{
            System.out.println(target + " not found");
        }

    }

    public static int performBinarySearchByRecursion(int[] arr, int target, int low , int high){
        while (low <= high){
            int mid = low + (high - low) /2;
            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target){
                return performBinarySearchByRecursion(arr, target, mid + 1, high);
            }

            return performBinarySearchByRecursion(arr, target, mid - 1, high);
        }

        return -1;
    }
}
