import java.util.Scanner;

public class binary_search_iterrative {
    public static void main(String[] args){
        System.out.println("Enter any array : ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target : ");
        int target = sc.nextInt();

        int result = performBinarySearch(arr, target);
        if(result != -1){
            System.out.println(target + " is found at index : " + result);
        }else{
            System.out.println(target + " not found !!!!");
        }
    }

    public static int performBinarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                low = mid - 1;
            }
        }
        return  -1;
    }
}
