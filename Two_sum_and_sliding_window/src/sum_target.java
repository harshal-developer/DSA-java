import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class sum_target {
    public static int[] findPairsOfTarget(int[] arr, int target){
        int i = 0;
        int j = arr.length - 1;
        while (i < j){
            int sum = arr[i] + arr[j];
            if(sum == target) return new int[]{arr[i], arr[j]};
            else if(sum < target) i++;
            else j--;
        }
        return new int[]{-1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements : ");
        int[] nums = new int[6];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the sum : ");
        int target = sc.nextInt();
        int[] paris = findPairsOfTarget(nums, target);

        System.out.println(Arrays.toString(paris));
        sc.close();
    }
}