import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class find_Leaders {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the numbers : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = findLeaders(arr);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    private static ArrayList<Integer> findLeaders(int[] nums){
        ArrayList<Integer> leaders = new ArrayList<>();
//        last element is always a leader
        int maxLast = nums[nums.length - 1];
        leaders.add(maxLast);

        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] > maxLast){
                leaders.add(nums[i]);
                maxLast = nums[i];
            }
        }
        return leaders;
    }
}
