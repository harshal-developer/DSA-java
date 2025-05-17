import java.util.Scanner;

public class SW_smallest_subArr_sum_greater_than_target {
    public static int findSubArrWhereSumGreaterThanTarget(int[] arr, int target){
//        window slide from left to right so :
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for(int right = 0; right < arr.length; right++){
//            here we add every right*th element to sum
            sum += arr[right];
            while (sum >= target){
                minLength = Math.min(minLength, right - left + 1);
                sum -= arr[left++];
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
    public static void main(String[] args){
        System.out.println("Enter any integers : ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target (find subarray length where sum > target : )");
        int target = sc.nextInt();
        int minLength = findSubArrWhereSumGreaterThanTarget(arr,target);
        System.out.println(minLength);
    }
}
