import java.util.Scanner;

public class SW_max_sum_subarr {

    public static int maxSumOfSubArr(int[] arr, int wsize){
        int windowSum = 0;
        int maxSum =  0;

//        calculate sum of initial window
        for(int i =0; i < wsize; i++){
            windowSum += arr[i];
        }
//        maintain maxSum :
        maxSum = windowSum;

//        slide the window
        for(int i = wsize; i < arr.length ; i++){
            windowSum += arr[i] - arr[i - wsize];
            maxSum = Math.max(windowSum, maxSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        System.out.println("Enter any arr : ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0 ;i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a window size : ");
        int wsize = sc.nextInt();
        int sum = maxSumOfSubArr(arr, wsize);
        System.out.println("Max sum of subarray is : " + sum);
    }

}
