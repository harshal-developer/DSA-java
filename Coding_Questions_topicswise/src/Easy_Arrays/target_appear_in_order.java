package Easy_Arrays;

import java.util.Scanner;

public class target_appear_in_order {
    public static void main(String[] args) {
        int[] nums = {3,4,5,5,56,56,56,54,4,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("What do do you want ot count 0 or 1  :");
        int target = sc.nextInt();
//        if(target == 0 || target == 1){
            int maxCount = countMaximumZerosOrOnes(nums, target);
            System.out.println("Maximum no of " + target + "  appears continously is : " + maxCount);
//        }else{
//            System.out.println("Invalid Input");
//        }
    }

    public static int countMaximumZerosOrOnes(int[] nums, int target){
        int counter = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                counter++;
                max = Math.max(max, counter);
            }else{
                counter = 0;
            }
        }
        return max;
    }
}
