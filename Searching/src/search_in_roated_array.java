import java.util.Scanner;

public class search_in_roated_array {
    public static int findTargetInRotatedArr(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
//            check whether which side is sorted
            int mid = low + (high - low) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(arr[low] < arr[mid]){
                if(target >= arr[low] && target < arr[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(target > arr[mid] && target <= arr[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return - 1;
    }
    public static void main(String[] args){
        System.out.println("Enter any rotated array : ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter any target : ");
        int target = sc.nextInt();

        int targetIndex = findTargetInRotatedArr(arr, target);
        if(targetIndex != -1){
            System.out.println(target + " found at Index : " + targetIndex);
        }else{
            System.out.println(target + " nod found");
        }
    }
}
