import java.util.Scanner;

public class Max {
    public static void main(String[] args){
        int[] nums = new int[8];
        System.out.println("Enter any 8 elements in an array : ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("here we finding max element in an array......");
        System.out.println(maxElementInArray(nums));
    }

    public static int maxElementInArray(int[] nums) {
        int max = nums[0];
//        for(int i = 0; i < nums.length; i++){
//            if(nums[i] > max){
//                max = nums[i];
//            }
//        }
        for(int no : nums){
            if(no > max){
                max = no;
            }
        }
        return max;
    }
}
